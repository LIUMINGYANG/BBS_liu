package com.laoer.bbscs.bean;

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
@Table(name = "bbscs_permission")
public class Permission implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3434947498241175450L;

    @Id
    private Long id;

    @Column(name = "PermissionName", length = 255, nullable = false)
    private String permissionName;

    @Column(name = "PermissionResource", length = 255)
    private String resource;

    @Column(name = "Action", length = 255)
    private String action;

    @Column(name = "TypeID", length = 2, nullable = false)
    private int typeID;

    public Permission() {
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getId() {

        return id;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public String getResource() {
        return resource;
    }

    public String getAction() {
        return action;
    }

    public int getTypeID() {
        return typeID;
    }
}
