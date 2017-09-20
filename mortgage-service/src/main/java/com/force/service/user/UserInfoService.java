package com.force.service.user;

import com.force.dal.dto.mysql.user.UserInfo;

/**
 * 用户信息
 * Created by ouyangjingzhou@jianyi.tech on 2017/6/20 0020.
 */
public interface UserInfoService {

    UserInfo selectByUsername(String username);

}
