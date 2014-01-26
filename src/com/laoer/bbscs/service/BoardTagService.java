package com.laoer.bbscs.service;

import com.laoer.bbscs.bean.BoardTag;
import com.laoer.bbscs.exception.*;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 17:14:14
 * To change this template use File | Settings | File Templates.
 */
public interface BoardTagService {

    public BoardTag saveBoardTag(BoardTag boardTag) throws BbscsException;

    public BoardTag findBoardTagById(String id);

    public void removeBoardTag(BoardTag boardTag) throws BbscsException;

}
