package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.LprodDao;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class LprodServlet
 */
@WebServlet("/LprodServlet")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LprodService lprodService;

    @Override
	public void init() throws ServletException {
    	lprodService = new LprodService();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<LprodVO> lprodList = lprodService.selectAllLprodList();

		request.setAttribute("lprodList", lprodList);

		request.getRequestDispatcher("/user/lprodList.jsp").
		forward(request, response);
	}



}
