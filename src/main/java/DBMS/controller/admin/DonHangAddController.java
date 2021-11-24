package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.dao.NSXDao;
import DBMS.model.DonHangModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/donhang-add"})
public class DonHangAddController extends HttpServlet {

	private static final long serialVersionUID = 8834418603765286634L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rq= req.getRequestDispatcher("/views/admin/donhang/add-donhang.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String madonhang = req.getParameter("madonhang");
		String ngaytao = req.getParameter("ngaytao");
		String manguoidung = req.getParameter("manguoidung");
		Date date1 = Date.valueOf(ngaytao);
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDao donhangdao = new DonHangDao(conn);
		
		DonHangModel donhangmodel = new DonHangModel(madonhang,date1,manguoidung);
		
		String alert = "";
		if (donhangdao.insert(donhangmodel)==1) {
			resp.sendRedirect(req.getContextPath()+"/admin/donhang");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/donhang/add-donhang.jsp").forward(req, resp);
		}
	}
}
