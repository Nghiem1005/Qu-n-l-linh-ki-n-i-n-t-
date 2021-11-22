package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NguoiDungDao;
import DBMS.model.NguoiDungModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/nguoidung-add"})

public class NguoiDungAddController extends HttpServlet {
	NguoiDungDao nguoidungdao = new NguoiDungDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rq= req.getRequestDispatcher("/views/admin/user/add-user.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String manguoidung = req.getParameter("manguoidung");
		String hoten = req.getParameter("hoten");
		String email = req.getParameter("email");
		String sdt = req.getParameter("sdt");
		
		NguoiDungModel nguoidungmodel = new NguoiDungModel(manguoidung,hoten,email,sdt);
		
		String alert = "";
		if (nguoidungdao.insert(nguoidungmodel) == 1) {
			resp.sendRedirect(req.getContextPath()+"/admin/nguoidung");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/user/add-user.jsp").forward(req, resp);
		}
	}
}
