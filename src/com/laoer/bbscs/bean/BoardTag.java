package com.laoer.bbscs.bean;

import java.io.*;
import org.apache.commons.lang.builder.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * <p>
 * Title: Tianyi BBS
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
 * @author Gong Tianyi
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_boardtag")
public class BoardTag implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3047066772996705989L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

	//private long boardID;

    @Column(name = "TagName",length = 255,nullable = false)
    private String tagName;

    @Column(name = "Orders",length = 11)
    private int orders;

    @ManyToOne
    @JoinColumn(name = "BoardID")
    private Board board;

	public BoardTag() {
	}

	public void setId(String id) {
		this.id = id;
	}

	//public void setBoardID(long boardID) {
	//	this.boardID = boardID;
	//}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getId() {
		return id;
	}

	//public long getBoardID() {
	//	return boardID;
	//}

	public String getTagName() {
		return tagName;
	}

	public int getOrders() {
		return orders;
	}

	public Board getBoard() {
		return board;
	}
    
    /*
	public boolean equals(Object obj) {
		if (obj instanceof BoardTag == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		BoardTag rhs = (BoardTag) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).append(id, rhs.getId()).isEquals();
	}*/

}
