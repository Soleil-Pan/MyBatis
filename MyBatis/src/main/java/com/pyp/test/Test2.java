package com.pyp.test;

import com.pyp.entity.Account;
import com.pyp.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        //a.添加对象
//        Account account = new Account(3l,"王五","123456",22);
//        accountRepository.save(account);
//        //提交事务
//        sqlSession.commit();
        //b.查询
//        List<Account> list = accountRepository.findAll();
//        for (Account account : list) {
//            System.out.println(account);
//        }
        //c.通过Id查询对象
//        Account account = accountRepository.findById(2);
//        System.out.println(account);
        //d.修改，JavaBean作为参数
//        Account account = accountRepository.findById(3l);
//        account.setUsername("小明");
//        account.setPassword("123");
//        account.setAge(18);
//        int result = accountRepository.update(account);
//        System.out.println(result);
//        sqlSession.commit();
        //e.通过ID删除对象
//        int result = accountRepository.deleteById(3l);
//        System.out.println(result);
//        sqlSession.commit();
        //通过Name查询对象
//        System.out.println(accountRepository.findByName("张三"));
        //包装类，可以接受null，通过Id查询Account
//        Long id = Long.parseLong("2");
//        System.out.println(accountRepository.findById2(id));
        //多个参数，通过name和age查询Account
//        System.out.println(accountRepository.findByNameAndAge("张三", 20));
        //1.基本数据类型，统计Account总数
//        System.out.println(accountRepository.count());
        //2.包装类，统计Account总数
//        System.out.println(accountRepository.count2());
        //3.String类型，通过Id查询Account的Name
        System.out.println(accountRepository.findNameById(1l));
        sqlSession.close();
    }
}
