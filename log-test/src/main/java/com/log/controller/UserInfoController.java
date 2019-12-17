package com.log.controller;

import com.log.entity.UserInfo;
import com.log.service.IUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/userinfos")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private IUserInfoService userInfoService;

    @GetMapping("")
    public List<UserInfo> get () {

        List<UserInfo> list = userInfoService.getList();
        return list;
    }

    @GetMapping("/{id}")
    public UserInfo getById (@PathVariable Integer id) {

        UserInfo userInfo = userInfoService.getById(id);
        return userInfo;
    }
}
