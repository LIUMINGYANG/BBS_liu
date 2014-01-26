package com.laoer.bbscs.bean;

import org.hibernate.annotations.*;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name = "bbscs_subscibe")
public class Subscibe implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5997983221018361450L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    @Column(name = "NickName", length = 60, nullable = false)
    private String nickName;

    //@Column(name = "PostID", length = 60, nullable = false)
    //private String postID;

    //@Column(name = "PostTitle", length = 150)
    //private String postTitle;

    @Column(name = "BoardID", length = 13, nullable = false)
    private long boardID;

    @Column(name = "Emailinform", length = 1)
    private int emailinform;

    @Column(name = "Msginform", length = 1)
    private int msginform;

    @Column(name = "UserEmail", length = 255)
    private String userEmail;

    @Column(name = "CreateTime", nullable = false)
    private Date createTime;

    @Column(name = "UserLocale", length = 20)
    private String userLocale;

    @ManyToOne(targetEntity = ForumMain.class,fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.JOIN)
    @LazyToOne(LazyToOneOption.FALSE)
    @JoinColumn(name = "PostID")    
    private Forum forum;

    public Subscibe() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    //public void setPostID(String postID) {
    //    this.postID = postID;
    //}

    //public void setPostTitle(String postTitle) {
    //    this.postTitle = postTitle;
    //}

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setEmailinform(int emailinform) {
        this.emailinform = emailinform;
    }

    public void setMsginform(int msginform) {
        this.msginform = msginform;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUserLocale(String userLocale) {
        this.userLocale = userLocale;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    //public String getPostID() {
    //    return postID;
    //}

    //public String getPostTitle() {
    //    return postTitle;
    //}

    public long getBoardID() {
        return boardID;
    }

    public int getEmailinform() {
        return emailinform;
    }

    public int getMsginform() {
        return msginform;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getUserLocale() {
        return userLocale;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}
