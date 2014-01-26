package com.laoer.bbscs.bean;

import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

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
@Table(name = "bbscs_usergroup")
public class UserGroup implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6518820956240847106L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "GroupName", length = 255, nullable = false)
    private String groupName;

    @Column(name = "GroupDesc", length = 255)
    private String groupDesc;

    @Column(name = "TypeID", length = 2, nullable = false)
    private int typeID;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, targetEntity = Role.class)
    @JoinTable(name = "bbscs_grouprole", joinColumns = @JoinColumn(name = "GroupID"), inverseJoinColumns = @JoinColumn(name = "RoleID"))
    private Set roles = new HashSet();

    public UserGroup() {
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public void setRoles(Set roles) {
        this.roles = roles;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public int getTypeID() {
        return typeID;
    }

    public Set getRoles() {
        return roles;
    }
}
