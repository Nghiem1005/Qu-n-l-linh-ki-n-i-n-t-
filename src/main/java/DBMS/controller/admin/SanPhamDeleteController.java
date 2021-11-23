package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.SanPhamDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/sanpham-delete"})
public class SanPhamDeleteController extends HttpServlet {
	SanPhamDao sanphamdao = new SanPhamDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String malinhkien = req.getParameter("malinhkien");
		
		sanphamdao.delete(malinhkien);
		
		resp.sendRedirect(req.getContextPath() + "/admin/sanpham");
		
		
	}
}
