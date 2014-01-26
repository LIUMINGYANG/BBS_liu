package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import java.io.*;
import java.util.*;
import javax.persistence.*;

/**
 * <p>
 * Title: 天乙社区
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
 * @author Gong Tianyi
 * @version 8.5
 */
@Entity
@Table(name = "bbscs_userinfo")
public class UserInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3061361040619333288L;

    private String id;

    private String userName;

    private String nickName;

    private String passwd;

    private String rePasswd;

    private String email;

    private String question;

    private String answer;

    private Date regTime;

    private Date loginTime;

    private String loginIP;

    private int loginTimes;

    private Date lastLoginTime;

    private String lastLoginIP;

    private int articleNum;

    private long stayTime;

    private int articleEliteNum;

    private int lifeForce;

    private int userTitle;

    private int literary;

    private int experience;

    private int userKnow;

    private String signName0;

    private String signDetail0;

    private String signName1;

    private String signDetail1;

    private String signName2;

    private String signDetail2;

    private int havePic;

    private String picFileName;

    private int forumPerNum;

    private int postPerNum;

    private String userFrom;

    private String timeZone;

    private int birthYear;

    private int birthMonth;

    private int birthDay;

    private int receiveNote;

    private int acceptFriend;

    private int forumViewMode;

    private UserDetail userDetail;

    private int validated;

    private int groupID;

    private int coin;

    private int hiddenLogin;

    private int editType;

    private String userLocale;

    private String validateCode;

    public UserInfo() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setRePasswd(String rePasswd) {
        this.rePasswd = rePasswd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public void setArticleNum(int articleNum) {
        this.articleNum = articleNum;
    }

    public void setStayTime(long stayTime) {
        this.stayTime = stayTime;
    }

    public void setArticleEliteNum(int articleEliteNum) {
        this.articleEliteNum = articleEliteNum;
    }

    public void setLifeForce(int lifeForce) {
        this.lifeForce = lifeForce;
    }

    public void setUserTitle(int userTitle) {
        this.userTitle = userTitle;
    }

    public void setLiterary(int literary) {
        this.literary = literary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setUserKnow(int userKnow) {
        this.userKnow = userKnow;
    }

    public void setSignName0(String signName0) {

        this.signName0 = signName0;
    }

    public void setSignDetail0(String signDetail0) {

        this.signDetail0 = signDetail0;
    }

    public void setSignName1(String signName1) {

        this.signName1 = signName1;
    }

    public void setSignDetail1(String signDetail1) {

        this.signDetail1 = signDetail1;
    }

    public void setSignName2(String signName2) {

        this.signName2 = signName2;
    }

    public void setSignDetail2(String signDetail2) {

        this.signDetail2 = signDetail2;
    }

    public void setHavePic(int havePic) {
        this.havePic = havePic;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    public void setForumPerNum(int forumPerNum) {
        this.forumPerNum = forumPerNum;
    }

    public void setPostPerNum(int postPerNum) {
        this.postPerNum = postPerNum;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setReceiveNote(int receiveNote) {
        this.receiveNote = receiveNote;
    }

    public void setAcceptFriend(int acceptFriend) {
        this.acceptFriend = acceptFriend;
    }

    public void setForumViewMode(int forumViewMode) {
        this.forumViewMode = forumViewMode;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public void setValidated(int validated) {
        this.validated = validated;
    }

    public void setGroupID(int groupID) {

        this.groupID = groupID;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void setHiddenLogin(int hiddenLogin) {
        this.hiddenLogin = hiddenLogin;
    }

    public void setEditType(int editType) {
        this.editType = editType;
    }

    public void setUserLocale(String userLocale) {
        this.userLocale = userLocale;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }


    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    public String getId() {
        return id;
    }

    @Column(name = "UserName", length = 20, nullable = false)
    public String getUserName() {
        return userName;
    }

    @Column(name = "NickName", length = 60, nullable = false)
    public String getNickName() {
        return nickName;
    }

    @Column(name = "Passwd", length = 40, nullable = false)
    public String getPasswd() {
        return passwd;
    }

    @Column(name = "RePasswd", length = 40, nullable = false)
    public String getRePasswd() {
        return rePasswd;
    }

    @Column(name = "Email", length = 255, nullable = false)
    public String getEmail() {
        return email;
    }

    @Column(name = "Question", length = 255, nullable = false)
    public String getQuestion() {
        return question;
    }

    @Column(name = "Answer", length = 255, nullable = false)
    public String getAnswer() {
        return answer;
    }

    @Column(name = "RegTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRegTime() {
        return regTime;
    }

    @Column(name = "LoginTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLoginTime() {
        return loginTime;
    }

    @Column(name = "LoginIP", length = 20, nullable = true)
    public String getLoginIP() {
        return loginIP;
    }

    @Column(name = "LoginTimes", length = 13, nullable = false)
    public int getLoginTimes() {
        return loginTimes;
    }

    @Column(name = "LastLoginTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    @Column(name = "LastLoginIP", length = 20)
    public String getLastLoginIP() {
        return lastLoginIP;
    }

    @Column(name = "ArticleNum", length = 11)
    public int getArticleNum() {
        return articleNum;
    }

    @Column(name = "StayTime", length = 13)
    public long getStayTime() {
        return stayTime;
    }

    @Column(name = "ArticleEliteNum", length = 11)
    public int getArticleEliteNum() {
        return articleEliteNum;
    }

    @Column(name = "LifeForce", length = 11)
    public int getLifeForce() {
        return lifeForce;
    }

    @Column(name = "UserTitle", length = 3)
    public int getUserTitle() {
        return userTitle;
    }

    @Column(name = "Literary", length = 11)
    public int getLiterary() {
        return literary;
    }

    @Column(name = "Experience", length = 11)
    public int getExperience() {
        return experience;
    }

    @Column(name = "UserKnow", length = 11)
    public int getUserKnow() {
        return userKnow;
    }

    @Column(name = "SignName0", length = 30)
    public String getSignName0() {

        return signName0;
    }

    @Column(name = "SignDetail0", length = 3000)
    public String getSignDetail0() {

        return signDetail0;
    }

    @Column(name = "SignName1", length = 30)
    public String getSignName1() {

        return signName1;
    }

    @Column(name = "SignDetail1", length = 3000)
    public String getSignDetail1() {

        return signDetail1;
    }

    @Column(name = "SignName2", length = 30)
    public String getSignName2() {

        return signName2;
    }

    @Column(name = "SignDetail2", length = 3000)
    public String getSignDetail2() {

        return signDetail2;
    }

    @Column(name = "HavePic", length = 1)
    public int getHavePic() {
        return havePic;
    }

    @Column(name = "PicFileName", length = 255)
    public String getPicFileName() {
        return picFileName;
    }

    @Column(name = "ForumPerNum", length = 3)
    public int getForumPerNum() {
        return forumPerNum;
    }

    @Column(name = "PostPerNum", length = 3)
    public int getPostPerNum() {
        return postPerNum;
    }

    @Column(name = "UserFrom", length = 255)
    public String getUserFrom() {
        return userFrom;
    }

    @Column(name = "TimeZone", length = 255)
    public String getTimeZone() {
        return timeZone;
    }

    @Column(name = "BirthYear", length = 4)
    public int getBirthYear() {
        return birthYear;
    }

    @Column(name = "BirthMonth", length = 2)
    public int getBirthMonth() {
        return birthMonth;
    }

    @Column(name = "BirthDay", length = 2)
    public int getBirthDay() {
        return birthDay;
    }

    @Column(name = "ReceiveNote", length = 1)
    public int getReceiveNote() {
        return receiveNote;
    }

    @Column(name = "AcceptFriend", length = 1)
    public int getAcceptFriend() {
        return acceptFriend;
    }

    @Column(name = "ForumViewMode", length = 1)
    public int getForumViewMode() {
        return forumViewMode;
    }

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    @LazyToOne(LazyToOneOption.NO_PROXY)
    public UserDetail getUserDetail() {
        return userDetail;
    }


    @Column(name = "Validated", length = 1)
    public int getValidated() {
        return validated;
    }

    @Column(name = "GroupID", length = 1)
    public int getGroupID() {
        return groupID;
    }

    @Column(name = "Coin", length = 11)
    public int getCoin() {
        return coin;
    }


    @Column(name = "HiddenLogin", length = 1)
    public int getHiddenLogin() {
        return hiddenLogin;
    }

    @Column(name = "EditType", length = 1)
    public int getEditType() {
        return editType;
    }

    @Column(name = "UserLocale", length = 20)
    public String getUserLocale() {
        return userLocale;
    }

    @Column(name = "ValidateCode", length = 20)
    public String getValidateCode() {
        return validateCode;
    }
}
