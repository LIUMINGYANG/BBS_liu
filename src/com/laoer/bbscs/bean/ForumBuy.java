package com.laoer.bbscs.bean;

import org.hibernate.annotations.GenericGenerator;

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
@Table(name = "bbscs_forumbuy")
public class ForumBuy {

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "PostID", length = 40, nullable = false)
    private String postID;

    @Column(name = "BuyFromID", length = 40, nullable = false)
    private String buyFromID;

    @Column(name = "BuyFromName", length = 20, nullable = false)
    private String buyFromName;

    @Column(name = "BuyToID", length = 40, nullable = false)
    private String buyToID;

    @Column(name = "BuyToName", length = 20, nullable = false)
    private String buyToName;

    @Column(name = "BuyPrice", length = 11, nullable = false)
    private int buyPrice;

    @Column(name = "BuyToUserIncome", length = 11, nullable = false)
    private int buyToUserIncome;

    @Column(name = "BuyTime", length = 20, nullable = false)
    private long buyTime;

    public ForumBuy() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public void setBuyFromID(String buyFromID) {
        this.buyFromID = buyFromID;
    }

    public void setBuyFromName(String buyFromName) {
        this.buyFromName = buyFromName;
    }

    public void setBuyToID(String buyToID) {
        this.buyToID = buyToID;
    }

    public void setBuyToName(String buyToName) {
        this.buyToName = buyToName;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setBuyToUserIncome(int buyToUserIncome) {
        this.buyToUserIncome = buyToUserIncome;
    }

    public void setBuyTime(long buyTime) {
        this.buyTime = buyTime;
    }

    public String getId() {
        return id;
    }

    public String getPostID() {
        return postID;
    }

    public String getBuyFromID() {
        return buyFromID;
    }

    public String getBuyFromName() {
        return buyFromName;
    }

    public String getBuyToID() {
        return buyToID;
    }

    public String getBuyToName() {
        return buyToName;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getBuyToUserIncome() {
        return buyToUserIncome;
    }

    public long getBuyTime() {
        return buyTime;
    }
}
