package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/getparameter")
public class GetParameter01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String formTag = "<form action="+ "\"number>\"" +">";
		
		out.print(formTag);
		for( int i =2; i < 10; i++) {
			
		String aTag = "<a href=localhost:/lesson01/getparameter?number=" + i + ">" + i + "단</a>";
		out.print(aTag + "<hr>");
		}
		out.print("</form>");
		
		}
	

}
