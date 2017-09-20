package com.force.dal.dao.mysql.user;

import com.force.dal.dto.mysql.user.UserActionLog;

public interface UserActionLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserActionLog record);

    int insertSelective(UserActionLog record);

    UserActionLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserActionLog record);

    int updateByPrimaryKeyWithBLOBs(UserActionLog record);

    int updateByPrimaryKey(UserActionLog record);
}