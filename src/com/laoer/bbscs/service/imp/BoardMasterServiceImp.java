package com.laoer.bbscs.service.imp;

import com.laoer.bbscs.bean.BoardMaster;
import com.laoer.bbscs.exception.BbscsException;
import com.laoer.bbscs.dao.BoardMasterDAO;
import com.laoer.bbscs.service.BoardMasterService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 15:06:01
 * To change this template use File | Settings | File Templates.
 */
public class BoardMasterServiceImp implements BoardMasterService {

    private static final Log logger = LogFactory.getLog(BoardMasterServiceImp.class);

    private BoardMasterDAO boardMasterDAO;

    public BoardMasterDAO getBoardMasterDAO() {
        return boardMasterDAO;
    }

    public void setBoardMasterDAO(BoardMasterDAO boardMasterDAO) {
        this.boardMasterDAO = boardMasterDAO;
    }

    public BoardMaster saveBoardMaster(BoardMaster boardMaster) throws BbscsException {
        try {
            return this.getBoardMasterDAO().saveBoardMaster(boardMaster);
        } catch (Exception e) {
            logger.error(e);
            throw new BbscsException(e);
        }
    }

    public BoardMaster getBoardMasterById(long id) {
        return this.getBoardMasterDAO().getBoardMasterById(id);
    }

    public void removeBoardMaster(BoardMaster boardMaster) throws BbscsException {
        try {
            this.getBoardMasterDAO().removeBoardMaster(boardMaster);
        } catch (Exception e) {
            logger.error(e);
            throw new BbscsException(e);
        }
    }
}
