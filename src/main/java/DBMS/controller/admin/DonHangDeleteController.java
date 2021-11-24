package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/donhang-delete"})
public class DonHangDeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String madonhang=req.getParameter("madonhang");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDao donhangdao= new DonHangDao(conn);
		
		donhangdao.delete(madonhang);
		
		resp.sendRedirect(req.getContextPath() + "/admin/donhang");
	}
}
