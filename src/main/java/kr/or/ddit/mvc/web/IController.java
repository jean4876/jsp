package kr.or.ddit.mvc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IController {

	void execute(HttpServletRequest req, HttpServletResponse resp);
}
