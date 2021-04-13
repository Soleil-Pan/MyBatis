package com.pyp.test;

import com.pyp.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        //调用MyBatis的原生接口执行添加操作。
        //加载MyBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "com.pyp.mapper.AccountMapper.save";
        Account account = new Account(1L,"张三","123",20);
        sqlSession.insert(statement,account);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
