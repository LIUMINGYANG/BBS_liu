package com.laoer.bbscs.dao;

import com.laoer.bbscs.bean.BoardMaster;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 14:54:47
 * To change this template use File | Settings | File Templates.
 */
public interface BoardMasterDAO {

    public BoardMaster saveBoardMaster(BoardMaster boardMaster);

    public BoardMaster getBoardMasterById(long id);

    public void removeBoardMaster(BoardMaster boardMaster);


}
