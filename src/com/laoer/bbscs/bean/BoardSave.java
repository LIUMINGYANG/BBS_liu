package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import javax.persistence.*;

/**
 * <p>
 * Title: TianyiBBS
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
 * @author Laoer
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_boardsave")
public class BoardSave implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5390014211916049604L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "BoardID", length = 13, nullable = false)
    private long boardID;

    public BoardSave() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public long getBoardID() {
        return boardID;
    }
}
