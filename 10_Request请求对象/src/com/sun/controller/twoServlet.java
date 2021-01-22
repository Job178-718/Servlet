package com.sun.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class twoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建存储数据的数组
        //1.声明数组；
        //2.创建数组对象，必须指定长度；
        //3.给数组中的元素赋值；
        String[] array = new String[100];

        int count = 0;
        //1.获取请求参数枚举
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            //这一步没问题
            String element = parameterNames.nextElement();
            //主要这一步的问题：数组的创建,countine;
            array[count]=element;
        }

        //2.获取参数值
        for(int i = 0; array.length > i; i++) {
            //传递第一个参数
            String[] s = request.getParameterValues(array[i]);
            for(int n = 0;n<s.length;n++){
                System.out.println(array[i]+"="+s[n]);
            }

        }

    }
}