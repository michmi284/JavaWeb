package com.michmi.servletdemo;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {

    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service被调用");
        int a = 0;
        int b = 10;
        System.out.println(a + b);
        System.out.println(b / a);
    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    @Override
    public void destroy()
    {

    }
}
