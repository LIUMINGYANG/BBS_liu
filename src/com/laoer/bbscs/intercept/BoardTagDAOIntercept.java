package com.laoer.bbscs.intercept;

import com.laoer.bbscs.service.Cache;
import com.laoer.bbscs.bean.BoardTag;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 17:30:03
 * To change this template use File | Settings | File Templates.
 */
public class BoardTagDAOIntercept {

    private Cache boardCache;

    public Cache getBoardCache() {
        return boardCache;
    }

    public void setBoardCache(Cache boardCache) {
        this.boardCache = boardCache;
    }

    public Object saveBoardTag(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        BoardTag boardTag = (BoardTag) args[0];
        Long key = boardTag.getBoard().getId();

        Object obj = method.invoke(target, args);        
        this.getBoardCache().remove(key);
        return obj;
    }

    public Object removeBoardTag(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        BoardTag boardTag = (BoardTag) args[0];
        Long key = boardTag.getBoard().getId();        

        Object obj = method.invoke(target, args);
        this.getBoardCache().remove(key);
        return obj;
    }
}
