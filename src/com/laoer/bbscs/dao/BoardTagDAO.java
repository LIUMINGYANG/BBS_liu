package com.laoer.bbscs.dao;

import com.laoer.bbscs.bean.BoardTag;

/**
 * Created by IntelliJ IDEA.
 * User: irtgong
 * Date: 2008-7-24
 * Time: 17:06:08
 * To change this template use File | Settings | File Templates.
 */
public interface BoardTagDAO {

    public BoardTag saveBoardTag(BoardTag boardTag);

    public BoardTag findBoardTagById(String id);

    public void removeBoardTag(BoardTag boardTag);

}
