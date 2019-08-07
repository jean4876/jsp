package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class SumCalculation
 */
@WebServlet("/SumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(SumCalculation.class);

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int startParam = Integer.parseInt(request.getParameter("start"));
		int endParam = Integer.parseInt(request.getParameter("end"));
		int sum = 0;
		
		for(int i = startParam; i <= endParam; i++ ) {
			logger.debug("start와 end사이의 값 : {}" , i);
			sum += i;
		}
		HttpSession session = request.getSession();
		
		
		session.setAttribute("sumResult", sum);
		
	      request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int startParam = Integer.parseInt(request.getParameter("start"));
		int endParam = Integer.parseInt(request.getParameter("end"));
		int sum = 0;
		
		for(int i = startParam; i <= endParam; i++ ) {
			logger.debug("start와 end사이의 값 : {}" , i);
			sum += i;
		}
		HttpSession session = request.getSession();
		
		
		session.setAttribute("sumResult", sum);
		
	      request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);
		
	}

}
