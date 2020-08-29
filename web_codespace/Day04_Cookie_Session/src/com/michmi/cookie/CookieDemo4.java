package com.michmi.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Cookie cookie = new Cookie("my", "梁言牛逼");
        cookie.setMaxAge(30);

//        //负数设置是默认，默认cookies是会话界别
//        cookie.setMaxAge(-1);
//        //删除cookie
//        cookie.setMaxAge(0);
//        //设置一个path让服务器下所有的项目共享cookie信息
//        cookie.setPath("/");

        resp.addCookie(cookie);
    }
}
