package com.force.biz.user.impl;

import com.force.biz.user.UserInfoBizService;
import com.force.dal.dto.mysql.user.UserInfo;
import com.force.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息
 * Created by ouyangjingzhou@jianyi.tech on 2017/6/20 0020.
 */
@Service
public class UserInfoBizServiceImpl implements UserInfoBizService {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserInfo selectByUsername(String username) {
        return userInfoService.selectByUsername(username);
    }

}
