package com.force.web.controller;

import com.force.dal.dto.mysql.user.UserInfo;
import com.force.service.user.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ouyangjingzhou@jianyi.tech on 2017/6/20 0020.
 */
@Controller
public class IndexController {

    private final static Logger logger = Logger.getLogger(IndexController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ModelAndView index() {
        UserInfo userInfo = userInfoService.selectByUsername("haha");
        System.out.println(userInfo);
        return new ModelAndView("/mortgage-web/test.html");
    }

}