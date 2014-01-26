package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.*;
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
 * Copyright: Copyright (c) 2008
 * </p>
 * <p/>
 * <p>
 * Company: Laoer.com
 * </p>
 *
 * @author Laoer
 * @version 8.5
 */

@Entity
@Table(name = "bbscs_agreeagainst")
public class AgreeAgainst implements Serializable {

    private String id;

    private String userID;

    private String postID;

    private long boardID;

    private int voteType;

    private long createTime;

    public AgreeAgainst() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setVoteType(int voteType) {
        this.voteType = voteType;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    public String getId() {
        return id;
    }

    @Column(name = "UserID", length = 40, nullable = false)
    public String getUserID() {
        return userID;
    }

    @Column(name = "PostID", length = 60, nullable = false)
    public String getPostID() {
        return postID;
    }

    @Column(name = "BoardID", length = 13, nullable = false)
    public long getBoardID() {
        return boardID;
    }

    @Column(name = "VoteType", length = 1)
    public int getVoteType() {
        return voteType;
    }

    @Column(name = "CreateTime", nullable = false)
    public long getCreateTime() {
        return createTime;
    }
}
