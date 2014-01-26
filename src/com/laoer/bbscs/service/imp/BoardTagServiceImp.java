package com.laoer.bbscs.service.imp;

import com.laoer.bbscs.service.BoardTagService;
import com.laoer.bbscs.bean.BoardTag;
import com.laoer.bbscs.exception.BbscsException;
import com.laoer.bbscs.dao.BoardTagDAO;
import com.laoer.bbscs.dao.ForumDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 17:18:50
 * To change this template use File | Settings | File Templates.
 */
public class BoardTagServiceImp implements BoardTagService {

    private static final Log logger = LogFactory.getLog(BoardTagServiceImp.class);

    private BoardTagDAO boardTagDAO;

    private ForumDAO forumDAO;

    private ForumDAO forumHistoryDAO;

    public BoardTagDAO getBoardTagDAO() {
        return boardTagDAO;
    }

    public void setBoardTagDAO(BoardTagDAO boardTagDAO) {
        this.boardTagDAO = boardTagDAO;
    }

    public ForumDAO getForumDAO() {
        return forumDAO;
    }

    public void setForumDAO(ForumDAO forumDAO) {
        this.forumDAO = forumDAO;
    }

    public ForumDAO getForumHistoryDAO() {
        return forumHistoryDAO;
    }

    public void setForumHistoryDAO(ForumDAO forumHistoryDAO) {
        this.forumHistoryDAO = forumHistoryDAO;
    }

    public BoardTag saveBoardTag(BoardTag boardTag) throws BbscsException {
        try {
            return this.getBoardTagDAO().saveBoardTag(boardTag);
        } catch (Exception e) {
            logger.error(e);
            throw new BbscsException(e);
        }
    }

    public BoardTag findBoardTagById(String id) {
        return this.getBoardTagDAO().findBoardTagById(id);
    }

    public void removeBoardTag(BoardTag boardTag) throws BbscsException {
        try {
            String tagID = boardTag.getId();
            this.getBoardTagDAO().removeBoardTag(boardTag);
            this.getForumDAO().updateForumsTag(tagID, "0", "");
            this.getForumHistoryDAO().updateForumsTag(tagID, "0", "");
        } catch (Exception e) {
            logger.error(e);
            throw new BbscsException(e);
        }
    }

}
