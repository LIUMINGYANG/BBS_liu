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
@Table(name = "bbscs_userlevel")
public class UserLevel {

    @Column(name = "LevelName", length = 60, nullable = false)
    private String levelName;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "LevelValue", length = 11, nullable = false)
    private int levelValue;

    @Column(name = "LevelType", length = 1, nullable = false)
    private int levelType;

    public UserLevel() {
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLevelValue(int levelValue) {
        this.levelValue = levelValue;
    }

    public void setLevelType(int levelType) {
        this.levelType = levelType;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getId() {
        return id;
    }

    public int getLevelValue() {
        return levelValue;
    }

    public int getLevelType() {
        return levelType;
    }
}
