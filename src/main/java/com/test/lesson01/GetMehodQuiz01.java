package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz01")
public class GetMehodQuiz01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		// Integer(wrapper class)를 이용하여 int형을 String으로 형변환
		int num = Integer.parseInt(request.getParameter("number"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><title>구구단</title>");
		// 파라미터로 받은 값에 해당하는 구구단 리스트 출력
		for ( int j = 1; j <= 9; j++ ) {
			out.println("<li>" + num + " x " + j + " = " + (num*j) + "</li>");
		}
		
		out.print("</body></html>");
	}
	
}
