package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.*;
import java.io.*;
import javax.persistence.*;

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
@Table(name = "bbscs_boardpermission")
public class BoardPermission {

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "BoardID", length = 20, nullable = false)
    private long boardID;

    @Column(name = "GroupID", length = 11, nullable = false)
    private int groupID;

    @Column(name = "Permissions")
    @Type(type = "com.laoer.bbscs.ext.hibernate.SplitList")
    private List permissions = new ArrayList();

    public BoardPermission() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void setPermissions(List permissions) {
        this.permissions = permissions;
    }

    public String getId() {
        return id;
    }

    public long getBoardID() {
        return boardID;
    }

    public int getGroupID() {
        return groupID;
    }

    public List getPermissions() {
        return permissions;
    }
}
