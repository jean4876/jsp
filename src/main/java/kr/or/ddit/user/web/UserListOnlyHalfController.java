package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.UserDao;

/**
 * Servlet implementation class UserListOnlyHalfController
 */
@WebServlet("/UserListOnlyHalf")
public class UserListOnlyHalfController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserListOnlyHalfController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao = new UserDao();
		List<User> userList = userDao.getUserListOnlyHalf();

		request.setAttribute("userList", userList);

		request.getRequestDispatcher("/user/userListOnlyHalf.jsp").forward(request, response);
	}


}
