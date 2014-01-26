package com.laoer.bbscs.bean;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.*;

/**
 * <p>
 * Title: 天乙社区
 * </p>
 *
 * <p>
 * Description: BBSCS
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2008
 * </p>
 *
 * <p>
 * Company: Laoer.com
 * </p>
 *
 * @author Gong Tianyi
 * @version 8.5
 */
@Entity
@Table(name = "bbscs_userdetail")
public class UserDetail implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6131442610830018890L;

	/** identifier field */
	private String id;

	/** nullable persistent field */
	private String height;

	/** nullable persistent field */
	private String weight;

	/** nullable persistent field */
	private String interest;

	/** nullable persistent field */
	private String graduate;

	/** nullable persistent field */
	private String favourPeople;

	/** nullable persistent field */
	private String dreamJob;

	/** nullable persistent field */
	private String favourArt;

	/** nullable persistent field */
	private String favourMusic;

	/** nullable persistent field */
	private String favourPlace;

	/** nullable persistent field */
	private String favourMovie;

	/** nullable persistent field */
	private String favourChat;

	/** nullable persistent field */
	private String favourBook;

	/** nullable persistent field */
	private String dreamLover;

	/** nullable persistent field */
	private String favourTeam;

	/** nullable persistent field */
	private String homePage;

	/** nullable persistent field */
	private String oicqNo;

	/** nullable persistent field */
	private String icqNo;

	/** nullable persistent field */
	private int sex;

	/** nullable persistent field */
	private String brief;

	/** nullable persistent field */
	private String msn;

	/** nullable persistent field */
	private String yahoo;

	private UserInfo userInfo;

	public UserDetail() {

	}

    @Column(name = "Brief", length = 1000)
    public String getBrief() {
		return brief;
	}

    @Column(name = "DreamJob", length = 255)
    public String getDreamJob() {
		return dreamJob;
	}

    @Column(name = "DreamLover", length = 255)
    public String getDreamLover() {
		return dreamLover;
	}

    @Column(name = "FavourArt", length = 255)
    public String getFavourArt() {
		return favourArt;
	}

    @Column(name = "FavourBook", length = 255)
    public String getFavourBook() {
		return favourBook;
	}

    @Column(name = "FavourChat", length = 255)
    public String getFavourChat() {
		return favourChat;
	}

    @Column(name = "FavourMovie", length = 255)
    public String getFavourMovie() {
		return favourMovie;
	}

    @Column(name = "FavourMusic", length = 255)
    public String getFavourMusic() {
		return favourMusic;
	}

    @Column(name = "FavourPeople", length = 255)
    public String getFavourPeople() {
		return favourPeople;
	}

    @Column(name = "FavourPlace", length = 255)
    public String getFavourPlace() {
		return favourPlace;
	}

    @Column(name = "FavourTeam", length = 255)
    public String getFavourTeam() {
		return favourTeam;
	}

    @Column(name = "Graduate", length = 255)
    public String getGraduate() {
		return graduate;
	}

    @Column(name = "Height", length = 255)
    public String getHeight() {
		return height;
	}

    @Column(name = "HomePage", length = 255)
    public String getHomePage() {
		return homePage;
	}

    @Column(name = "IcqNo", length = 255)
    public String getIcqNo() {
		return icqNo;
	}

    @Id
    @GeneratedValue(generator = "foreign")
    @GenericGenerator(name = "foreign", strategy = "foreign", parameters = { @Parameter(name = "property", value = "userInfo") })    
    public String getId() {
		return id;
	}

    @Column(name = "Interest", length = 255)
    public String getInterest() {
		return interest;
	}

    @Column(name = "Msn", length = 255)
    public String getMsn() {
		return msn;
	}

    @Column(name = "OicqNo", length = 255)
    public String getOicqNo() {
		return oicqNo;
	}

    @Column(name = "Sex", length = 1)
    public int getSex() {
		return sex;
	}

    @Column(name = "Weight", length = 255)
    public String getWeight() {
		return weight;
	}

    @Column(name = "Yahoo", length = 255)
    public String getYahoo() {
		return yahoo;
	}

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} , mappedBy="userDetail")    
    public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public void setDreamJob(String dreamJob) {
		this.dreamJob = dreamJob;
	}

	public void setDreamLover(String dreamLover) {
		this.dreamLover = dreamLover;
	}

	public void setFavourArt(String favourArt) {
		this.favourArt = favourArt;
	}

	public void setFavourBook(String favourBook) {
		this.favourBook = favourBook;
	}

	public void setFavourChat(String favourChat) {
		this.favourChat = favourChat;
	}

	public void setFavourMovie(String favourMovie) {
		this.favourMovie = favourMovie;
	}

	public void setFavourMusic(String favourMusic) {
		this.favourMusic = favourMusic;
	}

	public void setFavourPeople(String favourPeople) {
		this.favourPeople = favourPeople;
	}

	public void setFavourPlace(String favourPlace) {
		this.favourPlace = favourPlace;
	}

	public void setFavourTeam(String favourTeam) {
		this.favourTeam = favourTeam;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public void setIcqNo(String icqNo) {
		this.icqNo = icqNo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public void setOicqNo(String oicqNo) {
		this.oicqNo = oicqNo;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
