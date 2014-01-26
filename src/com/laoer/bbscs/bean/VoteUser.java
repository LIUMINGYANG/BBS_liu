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
@Table(name = "bbscs_voteuser")
public class VoteUser implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6546440582438669075L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "VoteID", length = 40, nullable = false)
    private String voteID;

    @Column(name = "VoteUserID", length = 40, nullable = false)
    private String voteUserID;

    @Column(name = "VoteTime", length = 13, nullable = false)
    private long voteTime;

	public VoteUser() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVoteID(String voteID) {
		this.voteID = voteID;
	}

	public void setVoteUserID(String voteUserID) {
		this.voteUserID = voteUserID;
	}

	public void setVoteTime(long voteTime) {
		this.voteTime = voteTime;
	}

	public String getId() {
		return id;
	}

	public String getVoteID() {
		return voteID;
	}

	public String getVoteUserID() {
		return voteUserID;
	}

	public long getVoteTime() {
		return voteTime;
	}
}
