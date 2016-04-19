package com.qy.controller;

import com.qy.po.UserInfo;
import com.qy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: UserInfoController 
 * @Description: TODO
 * @author leepon1990
 * @date 2016年4月6日 下午12:55:33 
 *
 */
@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value = "/view/{id}")
    public UserInfo view(@PathVariable Integer id) {
        UserInfo userInfo = userInfoService.getUserInfoById(id);
        return userInfo;
    }
}
