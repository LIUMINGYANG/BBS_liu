package com.laoer.bbscs.intercept;

import com.laoer.bbscs.service.Cache;
import com.laoer.bbscs.bean.Board;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-25
 * Time: 10:33:52
 * To change this template use File | Settings | File Templates.
 */
public class BoardDAOIntercept {

    private Cache boardCache;

    public Cache getBoardCache() {
        return boardCache;
    }

    public void setBoardCache(Cache boardCache) {
        this.boardCache = boardCache;
    }

    public Object saveBoard(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        Board board = (Board) args[0];
        Long key = board.getId();

        Object obj = method.invoke(target, args);
        if (key != null) {
            this.getBoardCache().remove(key);
        }
        return obj;
    }

    public Object removeBoard(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        Board board = (Board) args[0];
        Long key = board.getId();

        Object obj = method.invoke(target, args);
        this.getBoardCache().remove(key);
        return obj;
    }

    public Object getBoardByID(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        Long key = (Long) args[0];
        Object obj = this.getBoardCache().get(key);
        if (obj != null) {
            return obj;
        }
        obj = method.invoke(target, args);
        if (obj != null) {
            this.getBoardCache().add(key, obj);
        }
        return obj;
    }


}
