package com.log.mapper;

import com.log.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> getList ();

    UserInfo getById(@Param("id") Integer id);
}
