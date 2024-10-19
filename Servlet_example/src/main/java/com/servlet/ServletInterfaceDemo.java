//package com.servlet;
//
//
//import java.io.IOException;
//import java.util.Date;
//import java.io.*;
//
//import javax.servlet.Servlet;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//public class ServletInterfaceDemo implements Servlet{
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public ServletConfig getServletConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void init(ServletConfig arg0) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void service(ServletRequest res, ServletResponse req) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		res.setContentType("text/html");
//		Date d = new Date();
//		
//		PrintWriter pw =  res.getWriter();
//        pw.print("<HTML>");
//        pw.print("<HEAD><TITLE> SERVLET DEMO </TITLE></HEAD>");
//        pw.print("<BODY>");
//        pw.print("<H2> Hello from Servlet Interface... </H2>");
//        pw.print("</BODY>");
//        pw.print("</HTML>");
//
//	}
//
//}






package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceDemo implements Servlet {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<HTML>");
        pw.print("<HEAD><TITLE> SERVLET DEMO </TITLE></HEAD>");
        pw.print("<BODY>");
        pw.print("<H2> Hello from Servlet Interface... </H2>");
        pw.print("</BODY>");
        pw.print("</HTML>");
    }
}

















































