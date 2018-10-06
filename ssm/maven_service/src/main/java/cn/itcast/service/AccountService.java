package cn.itcast.service;
/*jianghaihua 2018/9/27 0027*/

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 添加账户
     * @param account
     */
    public void add(Account account);
}
