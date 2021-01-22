package com.sun.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class RequestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         * 获取请求的URL,Method;
         */
//        String url = request.getRequestURI().toString();
//        String method = request.getMethod();
//
//        System.out.println("请求地址"+url);
//        System.out.println("请求方法"+method);

        /**
         * 获取参数
         */
        //1.获取枚举对象
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String element = parameterNames.nextElement();
            System.out.println("传递的参数"+element);
        }
    }
}
