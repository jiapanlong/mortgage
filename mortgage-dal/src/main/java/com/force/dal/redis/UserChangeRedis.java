package com.force.dal.redis;


import com.force.commons.redis.annotation.Key;

import java.io.Serializable;
import java.util.Date;


public class UserChangeRedis implements Serializable {
    @Key
    private String userId;

    private Date changeDate;

    private Boolean idDelete = false;

    public UserChangeRedis() {

    }

    public UserChangeRedis(String userId, Date changeDate, Boolean idDelete) {
        this.userId = userId;
        this.changeDate = changeDate;
        this.idDelete = idDelete;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Boolean idDelete) {
        this.idDelete = idDelete;
    }

}
