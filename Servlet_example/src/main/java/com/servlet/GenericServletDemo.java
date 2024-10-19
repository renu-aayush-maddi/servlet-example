package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo  extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<HTML>");
        pw.print("<HEAD><TITLE> Generic SevletDemo </TITLE></HEAD>");
        pw.print("<BODY>");
        pw.print("<H2> Hello from GenericServlet class ... </H2>");
        pw.print("</BODY>");
        pw.print("</HTML>");
		
	}

}
