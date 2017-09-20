package com.force.dal.user;

import com.force.commons.redis.annotation.Key;

/**
 * Created by Jannsen on 2016/11/18.
 */
public class WebUserDetails {

    @Key
    private String sessionId;

    private String openId;

    private String userId;

    private String hlgUserId;

    public String getHlgUserId() {
        return hlgUserId;
    }

    public void setHlgUserId(String hlgUserId) {
        this.hlgUserId = hlgUserId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
