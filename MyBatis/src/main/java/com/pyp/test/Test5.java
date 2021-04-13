package com.pyp.test;

import com.pyp.entity.Account;
import com.pyp.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Account account = new Account();
        account.setId(1l);
        account.setUsername("张三");
        account.setPassword("123456");
        account.setAge(22);
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        Account account1 = accountRepository.findByAccount(account);
        System.out.println(account1);
        sqlSession.close();
    }
}
