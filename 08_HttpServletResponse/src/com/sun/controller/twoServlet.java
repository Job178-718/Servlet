package com.sun.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "twoServlet")
public class twoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * response主要是指通过服务器传递向浏览器的一些设置，及其数据；
         *
         */
        String str = "明天干啥？</br>";
        String str1 = "apple</br>orgin</br>egg " ;

        /**
         * 首先设置字符集；
         */
        response.setCharacterEncoding("GBK");
        response.setContentType("text/HTML");
        /**
         * 其次，获得输出集；
         */
        PrintWriter out = response.getWriter();

        out.write(str);
        out.write(str1);
    }
}
