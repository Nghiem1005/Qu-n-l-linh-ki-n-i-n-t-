package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.CartItemModel;
import DBMS.model.DonHangDetailModel;
import DBMS.model.DonHangModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/donhang-edit"})
public class DonHangUpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String madonhang = req.getParameter("madonhang");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDao donhangdao = new DonHangDao(conn);
		DonHangDetailDao donhangdetaildao = new DonHangDetailDao(conn);
		
		DonHangModel donhang = donhangdao.getIdDonHang(madonhang);
		
		List<DonHangDetailModel> listdonhangdetail=donhangdetaildao.ShowList(madonhang);
		//System.out.println(listdonhangdetail);
		
		req.setAttribute("listchitietdonhang", listdonhangdetail);
		req.setAttribute("listdonhang", donhang);
		
		RequestDispatcher rq= req.getRequestDispatcher("/views/admin/donhang/chitietdonhang.jsp");
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
		DonHangDetailDao donhangdetaildao = new DonHangDetailDao(conn);
		
		DonHangModel donhangmodel = new DonHangModel(madonhang,date1,manguoidung);
		
		String alert = "";
		if (donhangdao.update(donhangmodel)==1) {
			resp.sendRedirect(req.getContextPath()+"/admin/donhang");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("donhang", donhangmodel);
			List<DonHangDetailModel> listdonhangitem = donhangdetaildao.ShowList(madonhang);
			
			req.setAttribute("listchitietdonhang", listdonhangitem);
			req.getRequestDispatcher("/views/admin/donhang/chitietdonhang.jsp").forward(req, resp);
		}
	}
}
