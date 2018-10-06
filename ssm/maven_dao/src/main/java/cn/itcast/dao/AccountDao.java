package cn.itcast.dao;
/*jianghaihua 2018/9/27 0027*/

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();

    public void add(Account account);
}
