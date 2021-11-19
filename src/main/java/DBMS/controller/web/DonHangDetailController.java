package DBMS.controller.web;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.DonHangDetailModel;
import DBMS.model.DonHangModel;

@WebServlet(urlPatterns= {"/admin/donhang/chitietdonhang"})
public class DonHangDetailController extends HttpServlet {
	private static final long serialVersionUID = -8516864251823220492L;
	// buoc 1 : khoi tao Dao
	DonHangDetailDao donhangdetaildao= new DonHangDetailDao();
	DonHangDao donhangdao = new DonHangDao();
	
	
	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException{
		// thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String id= req.getParameter("iddonhang");
		
		
		DonHangModel donhangmodel = donhangdao.getIdDonHang(id);
		List<DonHangDetailModel> listdonhangdetail=donhangdetaildao.ShowList(id);
		req.setAttribute("listchitietdonhang", listdonhangdetail);
		req.setAttribute("listdonhang", donhangmodel);
		
		
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/donhang/chitietdonhang.jsp");
		rq.forward(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
