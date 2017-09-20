package com.force.dal.dto.mysql.user;

import java.util.Date;

public class ResourceInfo {
    private String id;

    private String parentId;

    private String resourceAuthority;

    private String resourceName;

    private Integer sortNo;

    private Date createdTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getResourceAuthority() {
        return resourceAuthority;
    }

    public void setResourceAuthority(String resourceAuthority) {
        this.resourceAuthority = resourceAuthority == null ? null : resourceAuthority.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}