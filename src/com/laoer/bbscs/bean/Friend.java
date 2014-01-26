package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.*;
import javax.persistence.*;

/**
 * <p>
 * Title: Tianyi BBS
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
 * @author Gong Tianyi
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_friend")
public class Friend implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5382754578376902099L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    @Column(name = "FriendID", length = 40, nullable = false)
    private String friendID;

    @Column(name = "FriendName", length = 20, nullable = false)
    private String friendName;

    @Column(name = "FriendComment", length = 2000)
    private String friendComment;

    @Column(name = "IsBlack", length = 1)
    private int isBlack;

    public Friend() {
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

    public void setFriendID(String friendID) {
        this.friendID = friendID;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public void setFriendComment(String friendComment) {
        this.friendComment = friendComment;
    }

    public void setIsBlack(int isBlack) {
        this.isBlack = isBlack;
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

    public String getFriendID() {
        return friendID;
    }

    public String getFriendName() {
        return friendName;
    }

    public String getFriendComment() {
        return friendComment;
    }

    public int getIsBlack() {
        return isBlack;
    }
}
