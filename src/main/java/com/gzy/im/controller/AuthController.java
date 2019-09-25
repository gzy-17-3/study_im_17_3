package com.gzy.im.controller;

import com.gzy.im.model.Account;
import com.gzy.im.server.AccountServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1/auth")
public class AuthController {


    @Resource
    AccountServer server;

    @GetMapping("/login")
    String login(){
        return "ok";
    }

    @PostMapping("/regist")
    Object regist(String email, String username, String password){
        // 新建用户  --
        return server.regist(email,username,password);
    }

    @PostMapping("/forget")
    String forget(){
        return "ok";
    }

}

