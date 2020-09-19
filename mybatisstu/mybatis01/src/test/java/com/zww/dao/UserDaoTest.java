package com.zww.dao;

import com.zww.pojo.User;
import com.zww.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void  test(){
        SqlSession sqlSession = null;
        try {
            //获取执行sql对象
            sqlSession = MybatisUtils.getSqlSession();
            //获取mapper
            Userdao userdao = sqlSession.getMapper(Userdao.class);
            List<User> userList = userdao.findAllUser();
            //遍历userList
            for (User user:userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源 线程不安全 每次用完都要记得关闭
            if (sqlSession != null){
                sqlSession.close();
            }
        }

    }
}
