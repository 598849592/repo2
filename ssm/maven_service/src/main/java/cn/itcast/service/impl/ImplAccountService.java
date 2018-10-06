package cn.itcast.service.impl;
/*jianghaihua 2018/9/27 0027*/

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImplAccountService implements AccountService{
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
     return accountDao.findAll();
    }

    @Override
    public void add(Account account) {
        accountDao.add(account);
    }
}
