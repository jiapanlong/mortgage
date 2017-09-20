package com.force.dal.dao.mysql.user;

import com.force.dal.dto.mysql.user.UserConfig;

public interface UserConfigMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserConfig record);

    int insertSelective(UserConfig record);

    UserConfig selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserConfig record);

    int updateByPrimaryKey(UserConfig record);
}