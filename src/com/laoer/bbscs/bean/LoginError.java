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
@Table(name = "bbscs_loginerror")
public class LoginError implements Serializable {

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "ErrorTimes", length = 11, nullable = false)
    private int errorTimes;

    @Column(name = "LoginTime", length = 20)
    private long loginTime;

    public LoginError() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setErrorTimes(int errorTimes) {
        this.errorTimes = errorTimes;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public int getErrorTimes() {
        return errorTimes;
    }

    public long getLoginTime() {
        return loginTime;
    }
}
