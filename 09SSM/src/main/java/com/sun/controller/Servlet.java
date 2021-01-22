package com.sun.controller;

import com.sun.dao.AccountDao;

import com.sun.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {


    @Autowired
    Account account;

    AccountDao ad;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.获取单个集合
        String user = request.getParameter("user");
        System.out.println(user);
        String password = request.getParameter("password");
        System.out.println(password);
        //2.注册账户
        account = new Account(user,password);
        //3.创建持久层；
        int register = ad.register(account);
        System.out.println(register);
    }
}
