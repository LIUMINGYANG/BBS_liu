package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import javax.persistence.*;
/**
 * <p>
 * Title: TianyiBBS
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
 * @author Laoer
 * @version 7.0
 */
@Entity
@Table(name = "bbscs_voteitem")
public class VoteItem implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7646785021711765140L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "VoteID", length = 40, nullable = false)
    private String voteID;

    @Column(name = "Item", length = 255, nullable = false)
    private String item;

    @Column(name = "ItemValue", length = 11)
    private int itemValue;

	public VoteItem() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVoteID(String voteID) {
		this.voteID = voteID;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}

	public String getId() {
		return id;
	}

	public String getVoteID() {
		return voteID;
	}

	public String getItem() {
		return item;
	}

	public int getItemValue() {
		return itemValue;
	}
}
