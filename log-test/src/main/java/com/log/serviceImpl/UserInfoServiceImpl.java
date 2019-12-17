package com.log.serviceImpl;

import com.log.mapper.UserInfoMapper;
import com.log.entity.UserInfo;
import com.log.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getList() {
        return userInfoMapper.getList();
    }

    @Override
    public UserInfo getById(Integer id) {
        return null;
    }
}
