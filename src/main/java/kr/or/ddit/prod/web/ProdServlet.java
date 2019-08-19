package kr.or.ddit.prod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.prod.model.prodVO;
import kr.or.ddit.prod.repository.IProdDao;
import kr.or.ddit.prod.repository.ProdDaoImpl;

/**
 * Servlet implementation class prodServlet
 */
@WebServlet("/Prod")
public class ProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ProdServlet.class);

	private IProdDao prodDao;

	@Override
	public void init() throws ServletException {
		prodDao = new ProdDaoImpl();

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		logger.debug("lprodgu = {}");


		String prod_lgu = request.getParameter("lprod_gu");


		List<prodVO> list = prodDao.selectLProdList(prod_lgu);

		request.setAttribute("list", list);

		request.getRequestDispatcher("/prod/prodList.jsp").forward(request, response);


	}


}
