package com.laoer.bbscs.bean;

import org.hibernate.annotations.Type;

import java.util.*;
import javax.persistence.*;

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
@Table(name = "bbscs_elite")
public class Elite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ParentID", length = 20, nullable = false)
    private long parentID;

    @Column(name = "ParentIDs")
    @Type(type = "com.laoer.bbscs.ext.hibernate.SplitList")
    private List parentIDs;

    @Column(name = "EliteName", length = 90)
    private String eliteName;

    @Column(name = "CreateUser", length = 60)
    private String createUser;

    @Column(name = "EliteTime", length = 20)
    private long eliteTime;

    @Column(name = "Orders", length = 11)
    private int orders;

    @Column(name = "BoardID", length = 20, nullable = false)
    private long boardID;

    public Elite() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
    }

    public void setParentIDs(List parentIDs) {
        this.parentIDs = parentIDs;
    }

    public void setEliteName(String eliteName) {
        this.eliteName = eliteName;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public void setEliteTime(long eliteTime) {
        this.eliteTime = eliteTime;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public Long getId() {
        return id;
    }

    public long getParentID() {
        return parentID;
    }

    public List getParentIDs() {
        return parentIDs;
    }

    public String getEliteName() {
        return eliteName;
    }

    public String getCreateUser() {
        return createUser;
    }

    public long getEliteTime() {
        return eliteTime;
    }

    public int getOrders() {
        return orders;
    }

    public long getBoardID() {
        return boardID;
    }
}
