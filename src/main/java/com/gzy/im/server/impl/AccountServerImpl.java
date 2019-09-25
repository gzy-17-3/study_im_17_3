package com.gzy.im.server.impl;

import com.gzy.im.model.Account;
import com.gzy.im.repository.AccountRepository;
import com.gzy.im.server.AccountServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServerImpl implements AccountServer {

    @Resource
    AccountRepository repository;

    @Override
    public Account regist(String email, String username, String password) {
        Account model = new Account();
        model.setUsername(username);
        model.setPassword(password);
        model.setEmail(email);
        Account account = repository.save(model);
        account.setPassword(null);
        return account;
    }
}
