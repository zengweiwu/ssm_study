package com.zww.zeng.mapper;

import com.zww.zeng.pojo.User;

import java.util.List;

/**
 * 用户dao层接口
 */
public interface UserMapper {
    List<User> queryAllUser();
}
