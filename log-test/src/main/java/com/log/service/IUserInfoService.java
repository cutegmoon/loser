package com.log.service;

import com.log.entity.UserInfo;

import java.util.List;

public interface IUserInfoService {

    /**
     * get list
     * @return
     */
    List<UserInfo> getList();

    /**
     * get by id
     * @param id
     * @return
     */
    UserInfo getById (Integer id);
}
