package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.SanPhamDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/sanpham-delete"})
public class SanPhamDeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String malinhkien = req.getParameter("malinhkien");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		SanPhamDao sanphamdao = new SanPhamDao(conn);
		
		sanphamdao.delete(malinhkien);
		
		resp.sendRedirect(req.getContextPath() + "/admin/sanpham");
		
		
	}
}
