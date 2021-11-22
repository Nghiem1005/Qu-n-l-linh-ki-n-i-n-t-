package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NguoiDungDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/nguoidung-delete"})
public class NguoiDungDeleteController extends HttpServlet {
	NguoiDungDao nguoidungdao = new NguoiDungDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String manguoidung= req.getParameter("manguoidung");
		
		nguoidungdao.Delete(manguoidung);
		
		resp.sendRedirect(req.getContextPath() + "/admin/nguoidung");
	}
}
