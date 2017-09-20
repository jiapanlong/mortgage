package com.force.dal.dao.mysql.user;

import com.force.dal.dto.mysql.user.RoleInfo;

public interface RoleInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    RoleInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}