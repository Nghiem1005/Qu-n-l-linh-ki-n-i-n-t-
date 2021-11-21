package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.DonHangDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/donhang-delete"})
public class DonHangDeleteController extends HttpServlet {
	DonHangDao donhangdao = new DonHangDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String madonhang=req.getParameter("madonhang");
		
		donhangdao.delete(madonhang);
		
		resp.sendRedirect(req.getContextPath() + "/admin/donhang");
	}
}
