package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.*;

/**
 * <p>Title: TianyiBBS</p>
 * <p/>
 * <p>Description: BBSCS</p>
 * <p/>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p/>
 * <p>Company: Laoer.com</p>
 *
 * @author Laoer
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_boardauthuser")
public class BoardAuthUser implements Serializable {

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "BoardID", length = 20, nullable = false)
    private long boardID;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    @Column(name = "CreateTime", length = 20)
    private long createTime;

    public BoardAuthUser() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public long getCreateTime() {
        return createTime;
    }
}
