package com.laoer.bbscs.bean;

import javax.persistence.*;
import java.util.*;
import java.io.Serializable;

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
@Table(name = "bbscs_boardmaster")
public class BoardMaster implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4233364009553449282L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private long boardID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    //private List purview;
    @ManyToOne
    @JoinColumn(name = "BoardID")
    private Board board;

    @Column(name = "OverChildPurview", length = 1)
    private int overChildPurview;

    @Column(name = "IsHidden", length = 1)
    private int isHidden;

    @Column(name = "RoleID", length = 11)
    private int roleID;

    public BoardMaster() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    //public void setBoardID(long boardID) {
    //	this.boardID = boardID;
    //}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //public void setPurview(List purview) {
    //	this.purview = purview;
    //}

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setOverChildPurview(int overChildPurview) {
        this.overChildPurview = overChildPurview;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public Long getId() {
        return id;
    }

    //public long getBoardID() {
    //	return boardID;
    //}

    public String getUserName() {
        return userName;
    }

    //public List getPurview() {
    //	return purview;
    //}

    public Board getBoard() {
        return board;
    }

    public int getOverChildPurview() {
        return overChildPurview;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public int getRoleID() {
        return roleID;
    }
}
