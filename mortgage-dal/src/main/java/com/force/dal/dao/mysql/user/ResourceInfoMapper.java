package com.force.dal.dao.mysql.user;

import com.force.dal.dto.mysql.user.ResourceInfo;

public interface ResourceInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ResourceInfo record);

    int insertSelective(ResourceInfo record);

    ResourceInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ResourceInfo record);

    int updateByPrimaryKey(ResourceInfo record);
}