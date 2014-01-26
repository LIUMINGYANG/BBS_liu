package com.laoer.bbscs.service;

import com.laoer.bbscs.bean.BoardMaster;
import com.laoer.bbscs.exception.BbscsException;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 15:03:38
 * To change this template use File | Settings | File Templates.
 */
public interface BoardMasterService {

    public BoardMaster saveBoardMaster(BoardMaster boardMaster) throws BbscsException;

    public BoardMaster getBoardMasterById(long id);

    public void removeBoardMaster(BoardMaster boardMaster) throws BbscsException;

}
