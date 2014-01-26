package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.*;
import java.util.*;
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
@Table(name = "bbscs_note")
public class Note implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3477954144482528377L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "FromID", length = 40, nullable = false)
    private String fromID;

    @Column(name = "FromUserName", length = 20, nullable = false)
    private String fromUserName;

    @Column(name = "FromNickName", length = 60, nullable = false)
    private String fromNickName;

    @Column(name = "ToID", length = 40, nullable = false)
    private String toID;

    @Column(name = "ToUserName", length = 20, nullable = false)
    private String toUserName;

    @Column(name = "ToNickName", length = 60, nullable = false)
    private String toNickName;

    @Column(name = "NoteType", length = 1, nullable = false)
    private int noteType;

    @Column(name = "NoteContext", nullable = false)
    private String noteContext;

    @Column(name = "CreateTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "IsNew", length = 1)
    private int isNew;

    @Column(name = "NeedRe", length = 1)
    private int needRe;

    @Column(name = "NoteTitle", length = 150, nullable = false)
    private String noteTitle;

    @Column(name = "IsRe", length = 1)
    private int isRe;

    @Column(name = "SysMsg", length = 1)
    private int sysMsg;

    public Note() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFromID(String fromID) {
        this.fromID = fromID;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public void setFromNickName(String fromNickName) {
        this.fromNickName = fromNickName;
    }

    public void setToID(String toID) {
        this.toID = toID;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public void setToNickName(String toNickName) {
        this.toNickName = toNickName;
    }

    public void setNoteType(int noteType) {
        this.noteType = noteType;
    }

    public void setNoteContext(String noteContext) {
        this.noteContext = noteContext;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setIsNew(int isNew) {
        this.isNew = isNew;
    }

    public void setNeedRe(int needRe) {

        this.needRe = needRe;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setIsRe(int isRe) {
        this.isRe = isRe;
    }

    public void setSysMsg(int sysMsg) {
        this.sysMsg = sysMsg;
    }

    public String getId() {
        return id;
    }

    public String getFromID() {
        return fromID;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public String getFromNickName() {
        return fromNickName;
    }

    public String getToID() {
        return toID;
    }

    public String getToUserName() {
        return toUserName;
    }

    public String getToNickName() {
        return toNickName;
    }

    public int getNoteType() {
        return noteType;
    }

    public String getNoteContext() {
        return noteContext;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getIsNew() {
        return isNew;
    }

    public int getNeedRe() {

        return needRe;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public int getIsRe() {
        return isRe;
    }

    public int getSysMsg() {
        return sysMsg;
    }
}
