package com.force.service.user.impl;

import com.force.dal.dao.mysql.user.UserInfoMapper;
import com.force.dal.dto.mysql.user.UserInfo;
import com.force.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息
 * Created by ouyangjingzhou@jianyi.tech on 2017/6/20 0020.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectByUsername(String username) {
        return userInfoMapper.selectByUsername(username);
    }

}
