package com.servlet.ujjwal;

import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HayServlet implements Servlet {

    ServletConfig conf;

    @Override
    public void init(ServletConfig Conf) throws ServletException {
        this.conf = Conf;
        System.out.println("Init methods is being executing .................");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Service is being processed .............");
        //this is content of response or dynamic page content
        resp.setContentType("text/html");
        //resp.setContentType("text/img");
        PrintWriter out=resp.getWriter();
        out.print("<h1>My RESUME</h1>");
        out.print("<h1>Date "+new Date() .toString() +"</h1>");

    }

    @Override
    public void destroy() {
        System.out.println("This servlet is being destroyed ..............");

    }

    public ServletConfig getServletConfig() {
        return this.conf;
    }

    public String getServletInfo() {
        return "this servlet iis created by Ujjwal Kashyap";
    }
}