package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.io.*;
import java.util.*;
import javax.persistence.*;

/**
 * <p>
 * Title: TianyiBBS
 * </p>
 *
 * <p>
 * Description: BBSCS
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2006
 * </p>
 *
 * <p>
 * Company: Laoer.com
 * </p>
 *
 * @author Laoer
 * @version 7.0
 */
@MappedSuperclass
public class Forum implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 659397874752488233L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "ParentID", length = 40, nullable = false)
    private String parentID;

    @Column(name = "MainID", length = 40, nullable = false)
    private String mainID;

    @Column(name = "BoardID", length = 20, nullable = false)
    private long boardID;

    @Column(name = "BoardName", length = 60)
    private String boardName;

    @Column(name = "ReNum", length = 11)
    private int reNum;

    @Column(name = "Face", length = 2)
    private int face;

    @Column(name = "UserID", length = 40)
    private String userID;

    @Column(name = "UserName", length = 20)
    private String userName;

    @Column(name = "NickName", length = 60)
    private String nickName;

    @Column(name = "Title", length = 150)
    private String title;

    @Column(name = "Detail")
    private String detail;

    @Column(name = "Sign")
    private String sign;

    @Column(name = "ArtSize",length = 11)
    private int artSize;

    @Column(name = "Click",length = 11)
    private int click;

    @Column(name = "PostTime",length = 20)
    private long postTime;

    @Column(name = "LastTime",length = 20)
    private long lastTime;

    @Column(name = "IPAddress",length = 20)
    private String ipAddress;

    @Column(name = "IsNew",length = 1)
    private int isNew;

    @Column(name = "Elite",length = 20)
    private long elite;

    @Column(name = "EliteID",length = 20)
    private long eliteID;

    @Column(name = "Agree",length = 11)
    private int agree;

    @Column(name = "BeAgainst",length = 11)
    private int beAgainst;

    @Column(name = "CanNotDel",length = 1)
    private int canNotDel;

    @Column(name = "DelSign",length = 1)
    private int delSign;

    @Column(name = "DelUserID",length = 40)
    private String delUserID;

    @Column(name = "DelUserName",length = 20)
    private String delUserName;

    @Column(name = "DelTime",length = 20)
    private long delTime;

    @Column(name = "DelIP",length = 20)
    private String delIP;

    @Column(name = "Amend",length = 255)
    private String amend;

    @Column(name = "DoEliteName",length = 20)
    private String doEliteName;

    @Column(name = "DoEliteTime",length = 20)
    private long doEliteTime;

    @Column(name = "HaveAttachFile",length = 1)
    private int haveAttachFile;

    @Column(name = "AttachFileName")
    @Type(type = "com.laoer.bbscs.ext.hibernate.SplitStringList")
    private List attachFileName = new ArrayList();

    @Column(name = "LastPostUserName",length = 20)
    private String lastPostUserName;

    @Column(name = "LastPostTitle",length = 150)
    private String lastPostTitle;

    @Column(name = "LastPostNickName",length = 60)
    private String lastPostNickName;

    @Column(name = "IsTop",length = 20)
    private long isTop;

    @Column(name = "IsLock",length = 1)
    private int isLock;

    @Column(name = "Auditing",length = 1)
    private int auditing;

    @Column(name = "AuditingAttachFile",length = 1)
    private int auditingAttachFile;

    @Column(name = "IsVote",length = 1)
    private int isVote;

    @Column(name = "IsHidden",length = 4)
    private int isHidden;

    @Column(name = "EditType",length = 1)
    private int editType;

    @Column(name = "QuoteText",length = 1)
    private String quoteText;

    @Column(name = "PostType",length = 1)
    private int postType;

    @Column(name = "TitleColor",length = 2)
    private int titleColor;

    @Column(name = "CanNotRe",length = 1)
    private int canNotRe;

    @Column(name = "Commend",length = 20)
    private long commend;

    @Column(name = "IsHiddenValue",length = 11)
    private int isHiddenValue;

    @Column(name = "UserBlog",length = 1)
    private int userBlog;

    @Column(name = "IndexStatus",length = 1)
    private int indexStatus;

    @Column(name = "QuoteEditType",length = 1)
    private int quoteEditType;

    @Column(name = "EmailInform",length = 1)
    private int emailInform;

    @Column(name = "MsgInform",length = 1)
    private int msgInform;

    @Column(name = "VoteID",length = 40)
    private String voteID;

    @Column(name = "TagID",length = 40)
    private String tagID;

    @Column(name = "TagName",length = 255)
    private String tagName;

    @Column(name = "IsGuest",length = 1)
    private int isGuest;

    @Column(name = "PreviewAttach",length = 1)
    private int previewAttach;

	public Forum() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public void setMainID(String mainID) {
		this.mainID = mainID;
	}

	public void setBoardID(long boardID) {
		this.boardID = boardID;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}

	public void setFace(int face) {
		this.face = face;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public void setArtSize(int artSize) {
		this.artSize = artSize;
	}

	public void setClick(int click) {
		this.click = click;
	}

	public void setPostTime(long postTime) {
		this.postTime = postTime;
	}

	public void setLastTime(long lastTime) {
		this.lastTime = lastTime;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}

	public void setElite(long elite) {
		this.elite = elite;
	}

	public void setEliteID(long eliteID) {
		this.eliteID = eliteID;
	}

	public void setAgree(int agree) {
		this.agree = agree;
	}

	public void setBeAgainst(int beAgainst) {
		this.beAgainst = beAgainst;
	}

	public void setCanNotDel(int canNotDel) {

		this.canNotDel = canNotDel;
	}

	public void setDelSign(int delSign) {
		this.delSign = delSign;
	}

	public void setDelUserID(String delUserID) {
		this.delUserID = delUserID;
	}

	public void setDelUserName(String delUserName) {
		this.delUserName = delUserName;
	}

	public void setDelTime(long delTime) {
		this.delTime = delTime;
	}

	public void setDelIP(String delIP) {
		this.delIP = delIP;
	}

	public void setAmend(String amend) {
		this.amend = amend;
	}

	public void setDoEliteName(String doEliteName) {
		this.doEliteName = doEliteName;
	}

	public void setDoEliteTime(long doEliteTime) {
		this.doEliteTime = doEliteTime;
	}

	public void setHaveAttachFile(int haveAttachFile) {
		this.haveAttachFile = haveAttachFile;
	}

	public void setAttachFileName(List attachFileName) {
		this.attachFileName = attachFileName;
	}

	public void setLastPostUserName(String lastPostUserName) {
		this.lastPostUserName = lastPostUserName;
	}

	public void setLastPostTitle(String lastPostTitle) {
		this.lastPostTitle = lastPostTitle;
	}

	public void setLastPostNickName(String lastPostNickName) {
		this.lastPostNickName = lastPostNickName;
	}

	public void setIsTop(long isTop) {
		this.isTop = isTop;
	}

	public void setIsLock(int isLock) {
		this.isLock = isLock;
	}

	public void setAuditing(int auditing) {
		this.auditing = auditing;
	}

	public void setAuditingAttachFile(int auditingAttachFile) {
		this.auditingAttachFile = auditingAttachFile;
	}

	public void setIsVote(int isVote) {
		this.isVote = isVote;
	}

	public void setIsHidden(int isHidden) {
		this.isHidden = isHidden;
	}

	public void setEditType(int editType) {
		this.editType = editType;
	}

	public void setQuoteText(String quoteText) {
		this.quoteText = quoteText;
	}

	public void setPostType(int postType) {
		this.postType = postType;
	}

	public void setTitleColor(int titleColor) {
		this.titleColor = titleColor;
	}

	public void setCanNotRe(int canNotRe) {
		this.canNotRe = canNotRe;
	}

	public void setCommend(long commend) {
		this.commend = commend;
	}

	public void setIsHiddenValue(int isHiddenValue) {
		this.isHiddenValue = isHiddenValue;
	}

	public void setUserBlog(int userBlog) {
		this.userBlog = userBlog;
	}

	public void setIndexStatus(int indexStatus) {
		this.indexStatus = indexStatus;
	}

	public void setQuoteEditType(int quoteEditType) {
		this.quoteEditType = quoteEditType;
	}

	public void setEmailInform(int emailInform) {
		this.emailInform = emailInform;
	}

	public void setMsgInform(int msgInform) {
		this.msgInform = msgInform;
	}

	public void setVoteID(String voteID) {
		this.voteID = voteID;
	}

	public void setTagID(String tagID) {
		this.tagID = tagID;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public void setIsGuest(int isGuest) {
		this.isGuest = isGuest;
	}

	public void setPreviewAttach(int previewAttach) {
		this.previewAttach = previewAttach;
	}

	public String getId() {
		return id;
	}

	public String getParentID() {
		return parentID;
	}

	public String getMainID() {
		return mainID;
	}

	public long getBoardID() {
		return boardID;
	}

	public String getBoardName() {
		return boardName;
	}

	public int getReNum() {
		return reNum;
	}

	public int getFace() {
		return face;
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

	public String getTitle() {
		return title;
	}

	public String getDetail() {
		return detail;
	}

	public String getSign() {
		return sign;
	}

	public int getArtSize() {
		return artSize;
	}

	public int getClick() {
		return click;
	}

	public long getPostTime() {
		return postTime;
	}

	public long getLastTime() {
		return lastTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public int getIsNew() {
		return isNew;
	}

	public long getElite() {
		return elite;
	}

	public long getEliteID() {
		return eliteID;
	}

	public int getAgree() {
		return agree;
	}

	public int getBeAgainst() {
		return beAgainst;
	}

	public int getCanNotDel() {

		return canNotDel;
	}

	public int getDelSign() {
		return delSign;
	}

	public String getDelUserID() {
		return delUserID;
	}

	public String getDelUserName() {
		return delUserName;
	}

	public long getDelTime() {
		return delTime;
	}

	public String getDelIP() {
		return delIP;
	}

	public String getAmend() {
		return amend;
	}

	public String getDoEliteName() {
		return doEliteName;
	}

	public long getDoEliteTime() {
		return doEliteTime;
	}

	public int getHaveAttachFile() {
		return haveAttachFile;
	}

	public List getAttachFileName() {
		return attachFileName;
	}

	public String getLastPostUserName() {
		return lastPostUserName;
	}

	public String getLastPostTitle() {
		return lastPostTitle;
	}

	public String getLastPostNickName() {
		return lastPostNickName;
	}

	public long getIsTop() {
		return isTop;
	}

	public int getIsLock() {
		return isLock;
	}

	public int getAuditing() {
		return auditing;
	}

	public int getAuditingAttachFile() {
		return auditingAttachFile;
	}

	public int getIsVote() {
		return isVote;
	}

	public int getIsHidden() {
		return isHidden;
	}

	public int getEditType() {
		return editType;
	}

	public String getQuoteText() {
		return quoteText;
	}

	public int getPostType() {
		return postType;
	}

	public int getTitleColor() {
		return titleColor;
	}

	public int getCanNotRe() {
		return canNotRe;
	}

	public long getCommend() {
		return commend;
	}

	public int getIsHiddenValue() {
		return isHiddenValue;
	}

	public int getUserBlog() {
		return userBlog;
	}

	public int getIndexStatus() {
		return indexStatus;
	}

	public int getQuoteEditType() {
		return quoteEditType;
	}

	public int getEmailInform() {
		return emailInform;
	}

	public int getMsgInform() {
		return msgInform;
	}

	public String getVoteID() {
		return voteID;
	}

	public String getTagID() {
		return tagID;
	}

	public String getTagName() {
		return tagName;
	}

	public int getIsGuest() {
		return isGuest;
	}

	public int getPreviewAttach() {
		return previewAttach;
	}
}
