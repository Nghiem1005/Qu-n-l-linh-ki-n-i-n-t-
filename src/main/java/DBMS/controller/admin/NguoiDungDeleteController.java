package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.NguoiDungDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/nguoidung-delete"})
public class NguoiDungDeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String manguoidung= req.getParameter("manguoidung");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NguoiDungDao nguoidungdao = new NguoiDungDao(conn);
		
		nguoidungdao.Delete(manguoidung);
		
		resp.sendRedirect(req.getContextPath() + "/admin/nguoidung");
	}
}
