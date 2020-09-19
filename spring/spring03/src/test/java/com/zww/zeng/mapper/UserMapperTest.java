package com.zww.zeng.mapper;

import com.zww.zeng.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * UserMapper测试类
 */
public class UserMapperTest {
    @Test
    public void testfindAllUser() throws IOException {
        //读取配置文件
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //打开会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取映射器
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行sql
        List<User> users = userMapper.queryAllUser();
        for (User u:users) {
            System.out.println(u);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.queryAllUser();
        for (User u:users) {
            System.out.println(u);
        }
    }
}
