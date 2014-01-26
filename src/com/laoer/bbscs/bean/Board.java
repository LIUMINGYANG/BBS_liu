package com.laoer.bbscs.bean;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Type;
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
@Table(name = "bbscs_board")
public class Board implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6384778470266269515L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ParentID", length = 20, nullable = false)
    private long parentID;

    @Column(name = "ParentIDs")
    @Type(type = "com.laoer.bbscs.ext.hibernate.SplitList")
    private List parentIDs;

    @Column(name = "ChildIDs")
    @Type(type = "com.laoer.bbscs.ext.hibernate.SplitList")
    private List childIDs;

    @Column(name = "BoardName", length = 60, nullable = false)
    private String boardName;

    @Column(name = "Explains")
    private String explains;

    @Column(name = "Bulletin")
    private String bulletin;

    @Column(name = "BoardPic")
    private String boardPic;

    @Column(name = "UseStat", length = 1)
    private int useStat;

    @Column(name = "Orders", length = 11)
    private int orders;

    @Column(name = "NeedPasswd", length = 1)
    private int needPasswd;

    @Column(name = "Passwd", length = 100)
    private String passwd;

    @Column(name = "BoardLevel", length = 11)
    private int level;

    @Column(name = "BoardType", length = 2)
    private int boardType;

    @Column(name = "AllowHTML", length = 1)
    private int allowHTML;

    @Column(name = "AllowUBB", length = 1)
    private int allowUBB;

    @Column(name = "AuditPost", length = 1)
    private int auditPost;

    @Column(name = "AuditAttach", length = 1)
    private int auditAttach;

    @Column(name = "AddUserPostNum", length = 1)
    private int addUserPostNum;

    @Column(name = "IsHidden", length = 1)
    private int isHidden;

    @Column(name = "IsAuth", length = 1)
    private int isAuth;

    @Column(name = "MainPostNum", length = 11)
    private long mainPostNum;

    @Column(name = "PostNum", length = 11)
    private long postNum;

    @OneToMany(cascade = CascadeType.ALL,targetEntity = BoardMaster.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "BoardID")
    @MapKey(name = "userName")
    @Fetch(value = FetchMode.SELECT)
    private Map boardMaster = new HashMap();

    @OneToMany(cascade = CascadeType.ALL,targetEntity = BoardTag.class,fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SELECT)
    @JoinColumn(name = "BoardID")
    @OrderBy("orders asc")
    private Set boardTag = new HashSet();

    public Board() {
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

    public void setChildIDs(List childIDs) {
        this.childIDs = childIDs;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public void setBoardPic(String boardPic) {
        this.boardPic = boardPic;
    }

    public void setUseStat(int useStat) {
        this.useStat = useStat;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public void setNeedPasswd(int needPasswd) {
        this.needPasswd = needPasswd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setBoardType(int boardType) {
        this.boardType = boardType;
    }

    public void setAllowHTML(int allowHTML) {
        this.allowHTML = allowHTML;
    }

    public void setAllowUBB(int allowUBB) {
        this.allowUBB = allowUBB;
    }

    public void setAuditPost(int auditPost) {
        this.auditPost = auditPost;
    }

    public void setAuditAttach(int auditAttach) {
        this.auditAttach = auditAttach;
    }

    public void setAddUserPostNum(int addUserPostNum) {
        this.addUserPostNum = addUserPostNum;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public void setIsAuth(int isAuth) {
        this.isAuth = isAuth;
    }

    public void setMainPostNum(long mainPostNum) {
        this.mainPostNum = mainPostNum;
    }

    public void setPostNum(long postNum) {
        this.postNum = postNum;
    }

    public void setBoardMaster(Map boardMaster) {
        this.boardMaster = boardMaster;
    }

    public void setBoardTag(Set boardTag) {
        this.boardTag = boardTag;
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

    public List getChildIDs() {
        return childIDs;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getExplains() {
        return explains;
    }

    public String getBulletin() {
        return bulletin;
    }

    public String getBoardPic() {
        return boardPic;
    }

    public int getUseStat() {
        return useStat;
    }

    public int getOrders() {
        return orders;
    }

    public int getNeedPasswd() {
        return needPasswd;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getLevel() {
        return level;
    }

    public int getBoardType() {
        return boardType;
    }

    public int getAllowHTML() {
        return allowHTML;
    }

    public int getAllowUBB() {
        return allowUBB;
    }

    public int getAuditPost() {
        return auditPost;
    }

    public int getAuditAttach() {
        return auditAttach;
    }

    public int getAddUserPostNum() {
        return addUserPostNum;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public int getIsAuth() {
        return isAuth;
    }

    public long getMainPostNum() {
        return mainPostNum;
    }

    public long getPostNum() {
        return postNum;
    }

    public Map getBoardMaster() {
        return boardMaster;
    }

    public Set getBoardTag() {
        return boardTag;
    }

    public long getTopBid() {
        long topBid = this.getId().longValue();
        if (this.getParentIDs() != null && this.getParentIDs().size() > 0) {
            topBid = ((Long) this.getParentIDs().get(0)).longValue();
        }
        return topBid;
    }

    public BoardTag getBoardTagById(String tagid) {
        BoardTag bt = null;
        Iterator it = getBoardTag().iterator();
        while (it.hasNext()) {
            bt = (BoardTag) it.next();
            if (bt.getId().equals(tagid)) {
                return bt;
            }
        }
        return bt;
    }
}
