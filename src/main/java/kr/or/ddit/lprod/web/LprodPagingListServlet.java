package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.ILprodDao;
import kr.or.ddit.lprod.repository.LprodDao;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;

/**
 * Servlet implementation class LprodPagingListServlet
 */
@WebServlet("/LprodPagingList")
public class LprodPagingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ILprodService lprodService;

    @Override
	public void init() throws ServletException {
    	lprodService = new LprodService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pageStr = request.getParameter("page");
		String pagesizeStr = request.getParameter("pagesize");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int pagesize = pagesizeStr == null ? 10 : Integer.parseInt(pagesizeStr);

		Page p = new Page(page, pagesize);

		request.setAttribute("pageVo", p);



		Map<String, Object> resultMap = lprodService.getLprodPagingList(p);
		List<LprodVO> lprodList = (List<LprodVO>) resultMap.get("lprodList");
		int paginationSize = (Integer) resultMap.get("paginationSize");
		request.setAttribute("lprodList", lprodList);
		request.setAttribute("paginationSize", paginationSize);

		request.getRequestDispatcher("/user/lprodPagingList.jsp").forward(request, response);




	}


}

