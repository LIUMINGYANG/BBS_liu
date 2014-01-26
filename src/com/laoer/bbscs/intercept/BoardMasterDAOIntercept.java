package com.laoer.bbscs.intercept;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import com.laoer.bbscs.service.Cache;
import com.laoer.bbscs.bean.BoardMaster;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 15:33:18
 * To change this template use File | Settings | File Templates.
 */
public class BoardMasterDAOIntercept {

    private Cache boardCache;

    public Cache getBoardCache() {
        return boardCache;
    }

    public void setBoardCache(Cache boardCache) {
        this.boardCache = boardCache;
    }

    public Object saveBoardMaster(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        BoardMaster boardMaster = (BoardMaster) args[0];
        Long key = boardMaster.getBoard().getId();

        Object obj = method.invoke(target, args);
        this.getBoardCache().remove(key);
        return obj;
    }

    public Object removeBoardMaster(JoinPoint joinPoint) throws Exception {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();

        BoardMaster boardMaster = (BoardMaster) args[0];
        Long key = boardMaster.getBoard().getId();

        Object obj = method.invoke(target, args);
        this.getBoardCache().remove(key);
        return obj;
    }


}
