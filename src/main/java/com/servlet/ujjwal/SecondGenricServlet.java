package com.servlet.ujjwal;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SecondGenricServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is servlet using generic servlet");
        servletResponse.setContentType("text/html");
        PrintWriter out= servletResponse.getWriter();
        out.print("<h1>  This is My second servlet using generic servlet</h1> ");
        out.print("<h1>Date "+new Date() .toString() +"</h1>");
    }
}
