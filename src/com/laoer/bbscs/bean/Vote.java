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
@Table(name = "bbscs_vote")
public class Vote implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1741600212281533826L;

    @Id
    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
    private String id;

    @Column(name = "Title", length = 255, nullable = false)
    private String title;

    @Column(name = "IsM", length = 1)
    private int isM;

    @Column(name = "DeadLine", length = 13)
    private long deadLine;

    public Vote() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsM(int isM) {
        this.isM = isM;
    }

    public void setDeadLine(long deadLine) {
        this.deadLine = deadLine;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getIsM() {
        return isM;
    }

    public long getDeadLine() {
        return deadLine;
    }
}
