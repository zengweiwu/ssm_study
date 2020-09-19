package com.zww.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybayis工具类
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 加载配置文件 获取SqlSessionFactory对象
     */
    static {
        String resource = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取SqlSessiond对象
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
