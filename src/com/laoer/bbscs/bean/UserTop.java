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
@Table(name = "bbscs_usertop")
public class UserTop implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -3632244343719173333L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "UserID", length = 40, nullable = false)
    private String userID;

    @Column(name = "UserName", length = 20, nullable = false)
    private String userName;

    @Column(name = "NickName", length = 60, nullable = false)
    private String nickName;

    @Column(name = "ValueType", length = 2, nullable = false)
    private int valueType;

    @Column(name = "UserValue", length = 11)
    private int userValue;

    @Column(name = "ValueInc", length = 11)
    private int valueInc;

	public UserTop() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setValueType(int valueType) {
		this.valueType = valueType;
	}

	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}

	public void setValueInc(int valueInc) {
		this.valueInc = valueInc;
	}

	public String getId() {
		return id;
	}

	public String getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getNickName() {
		return nickName;
	}

	public int getValueType() {
		return valueType;
	}

	public int getUserValue() {
		return userValue;
	}

	public int getValueInc() {
		return valueInc;
	}
}
