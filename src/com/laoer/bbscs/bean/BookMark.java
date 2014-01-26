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
@Table(name = "bbscs_bookmark")
public class BookMark implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2907756203476233319L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "BookMarkName", length = 255, nullable = false)
    private String bookMarkName;

    @Column(name = "Url", length = 255)
    private String url;

    @Column(name = "Alt", length = 255)
    private String alt;

    @Column(name = "IsShare", length = 1)
    private int isShare;

    @Column(name = "CreateTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public BookMark() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setBookMarkName(String bookMarkName) {
        this.bookMarkName = bookMarkName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setIsShare(int isShare) {
        this.isShare = isShare;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getBookMarkName() {
        return bookMarkName;
    }

    public String getUrl() {
        return url;
    }

    public String getAlt() {
        return alt;
    }

    public int getIsShare() {
        return isShare;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
