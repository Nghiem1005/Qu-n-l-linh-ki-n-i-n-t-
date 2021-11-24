package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.LoaiDao;
import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/home" })
public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");

		SanPhamDao spdao = new SanPhamDao(conn);


		List<SanPhamModel> l1 = spdao.getTop4Product();
		List<SanPhamModel> l2 = spdao.getBest4Product();
		if(l2.size() > 0) {
			SanPhamModel best = l2.get(0);
			req.setAttribute("best", best);
		}

		req.setAttribute("listnew4product", l1);
		req.setAttribute("listbest4product", l2);
		RequestDispatcher rq = req.getRequestDispatcher("/views/web/web_home.jsp");
		rq.forward(req, resp);
	}
}
