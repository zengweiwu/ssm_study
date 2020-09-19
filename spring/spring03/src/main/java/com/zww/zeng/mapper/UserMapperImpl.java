package com.zww.zeng.mapper;

import com.zww.zeng.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * user接口实现类
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryAllUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.queryAllUser();
    }
}
