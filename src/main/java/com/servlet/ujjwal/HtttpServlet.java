package com.servlet.ujjwal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HtttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is get methord");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.print("<h1>This is Get method of My servlet");
        out.print("<h1>Date "+new Date() .toString() +"</h1>");
    }
}
