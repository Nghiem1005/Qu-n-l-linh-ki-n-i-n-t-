package DBMS.controller.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
//		SanPhamDao sanphamDao = new SanPhamDao();
//
//		List<SanPhamModel> l1 = sanphamDao.getTop4Product();
//		List<SanPhamModel> l2 = sanphamDao.getBest4Product();
//		SanPhamModel best = l2.get(0);
//		
//		req.setAttribute("best", best);
//		req.setAttribute("listnew4product", l1);
//		req.setAttribute("listbest4product", l2);
		RequestDispatcher rq = req.getRequestDispatcher("/views/web/web_home.jsp");
		rq.forward(req, resp);
	}
}
