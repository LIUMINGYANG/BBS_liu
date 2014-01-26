package com.laoer.bbscs.dao.hibernate;

import org.springframework.orm.hibernate3.support.*;
import com.laoer.bbscs.dao.BoardMasterDAO;
import com.laoer.bbscs.bean.BoardMaster;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 14:59:35
 * To change this template use File | Settings | File Templates.
 */
public class BoardMasterHibernateDAO extends HibernateDaoSupport implements BoardMasterDAO {

    public BoardMaster saveBoardMaster(BoardMaster boardMaster) {
        this.getHibernateTemplate().saveOrUpdate(boardMaster);
        return boardMaster;
    }

    public BoardMaster getBoardMasterById(long id) {
        return (BoardMaster) this.getHibernateTemplate().get(BoardMaster.class, id);
    }

    public void removeBoardMaster(BoardMaster boardMaster) {
        this.getHibernateTemplate().delete(boardMaster);
    }
}
