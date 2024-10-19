package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void  doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException	
	{
		res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<HTML>");
        pw.print("<HEAD><TITLE>HttpServlet Demo </TITLE></HEAD>");
        pw.print("<BODY>");
        pw.print("<H2> Hello from HttpServlet Interface... </H2>");
        pw.print("</BODY>");
        pw.print("</HTML>");
	}

}
