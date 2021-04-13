package com.pyp.repository;

import com.pyp.entity.Account;

import java.util.List;

public interface AccountRepository {

    public int save(Account account);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
    public Account findById(long id);
    public Account findByName(String name);
    public Account findById2(Long id);
    public Account findByNameAndAge(String name,int age);
    public int count();
    public Integer count2();
    public String findNameById(long id);
    public Account findByAccount(Account account);

}
