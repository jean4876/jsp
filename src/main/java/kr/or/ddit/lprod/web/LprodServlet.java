package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.LprodDaoImpl;

/**
 * Servlet implementation class LprodServlet
 */
@WebServlet("/LprodServlet")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LprodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LprodDaoImpl lprodDao = new LprodDaoImpl();
		List<LprodVO> lprodList = lprodDao.selectAllLprodList();

		request.setAttribute("lprodList", lprodList);

		request.getRequestDispatcher("/user/lprodList.jsp").
		forward(request, response);
	}



}
