package com.laoer.bbscs.dao.hibernate;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.laoer.bbscs.dao.BoardTagDAO;
import com.laoer.bbscs.bean.BoardTag;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 17:08:08
 * To change this template use File | Settings | File Templates.
 */
public class BoardTagHibernateDAO extends HibernateDaoSupport implements BoardTagDAO {

    public BoardTag saveBoardTag(BoardTag boardTag) {
        this.getHibernateTemplate().saveOrUpdate(boardTag);
        return boardTag;
    }

    public BoardTag findBoardTagById(String id) {
        return (BoardTag) this.getHibernateTemplate().get(BoardTag.class, id);
    }

    public void removeBoardTag(BoardTag boardTag) {        
        this.getHibernateTemplate().delete(boardTag);
    }
}