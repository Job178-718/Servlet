package com.sun.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class threeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String home = request.getParameter("home");
        System.out.println("浏览器参数home的值："+home);

        String[] names = request.getParameterValues("name");
        for(String name:names){
            System.out.println("浏览器参数name的值："+name);
        }
    }
}
