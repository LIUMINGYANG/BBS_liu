package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.*;

/**
 * <p>Title: Tianyi BBS</p>
 * <p/>
 * <p>Description: BBSCS</p>
 * <p/>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p/>
 * <p>Company: Laoer.com</p>
 *
 * @author Gong Tianyi
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_useronline")
public class UserOnline {

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

    @Column(name = "OnlineTime", length = 20)
    private long onlineTime;

    @Column(name = "AtPlace", length = 255)
    private String atPlace;

    @Column(name = "UserGroupID", length = 11)
    private int userGroupID;

    @Column(name = "ValidateCode", length = 100)
    private String validateCode;

    @Column(name = "BoardID", length = 20)
    private long boardID;

    @Column(name = "HiddenUser", length = 1)
    private int hiddenUser;

    public UserOnline() {
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

    public void setOnlineTime(long onlineTime) {
        this.onlineTime = onlineTime;
    }

    public void setAtPlace(String atPlace) {
        this.atPlace = atPlace;
    }

    public void setUserGroupID(int userGroupID) {
        this.userGroupID = userGroupID;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setHiddenUser(int hiddenUser) {
        this.hiddenUser = hiddenUser;
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

    public long getOnlineTime() {
        return onlineTime;
    }

    public String getAtPlace() {
        return atPlace;
    }

    public int getUserGroupID() {
        return userGroupID;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public long getBoardID() {
        return boardID;
    }

    public int getHiddenUser() {
        return hiddenUser;
    }
}
