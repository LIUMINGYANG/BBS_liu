package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import javax.persistence.*;

/**
 * <p>
 * Title: TianyiBBS
 * </p>
 * <p/>
 * <p>
 * Description: BBSCS
 * </p>
 * <p/>
 * <p>
 * Copyright: Copyright (c) 2006
 * </p>
 * <p/>
 * <p>
 * Company: Laoer.com
 * </p>
 *
 * @author Laoer
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_commend")
public class Commend implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3639230134895436380L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "BoardID", length = 13, nullable = false)
    private long boardID;

    @Column(name = "BoardName", length = 60, nullable = false)
    private String boardName;

    @Column(name = "PostID", length = 40, nullable = false)
    private String postID;

    @Column(name = "PostMainID", length = 40, nullable = false)
    private String postMainID;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    @Column(name = "CommendBoardID", length = 13, nullable = false)
    private long commendBoardID;

    @Column(name = "CommendTop", length = 1, nullable = false)
    private int commendTop;

    @Column(name = "Title", length = 150)
    private String title;

    @Column(name = "BoardCategory", length = 40)
    private String boardCategory;

    @Column(name = "TopCategory", length = 40)
    private String topCategory;

    @Column(name = "CreateTime", length = 20, nullable = false)
    private long createTime;

    public Commend() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public void setPostMainID(String postMainID) {
        this.postMainID = postMainID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCommendBoardID(long commendBoardID) {
        this.commendBoardID = commendBoardID;
    }

    public void setCommendTop(int commendTop) {
        this.commendTop = commendTop;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBoardCategory(String boardCategory) {
        this.boardCategory = boardCategory;
    }

    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public long getBoardID() {
        return boardID;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getPostID() {
        return postID;
    }

    public String getPostMainID() {
        return postMainID;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public long getCommendBoardID() {
        return commendBoardID;
    }

    public int getCommendTop() {
        return commendTop;
    }

    public String getTitle() {
        return title;
    }

    public String getBoardCategory() {
        return boardCategory;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public long getCreateTime() {
        return createTime;
    }
}
