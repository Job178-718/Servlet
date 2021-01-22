package com.sun.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "oneServlet")
public class oneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String str="Hello HttpServletResponse";
       //1> 获取数据流;
        // 2> 获取响应体对象;
       PrintWriter writer = response.getWriter();
       //2> 将字符串写入响应体
       writer.println(str);
    }
}
