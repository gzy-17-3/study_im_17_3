package com.gzy.im.server;


import com.gzy.im.model.Account;

public interface AccountServer {
    Account regist(String email, String username, String password);
}
