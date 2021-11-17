package DBMS.controller.web;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.DonHangDetailDao;
import DBMS.model.DonHangDetailModel;

@WebServlet(urlPatterns= {"/admin/donhang/chitietdonhang"})
public class DonHangDetailController extends HttpServlet {
	private static final long serialVersionUID = -8516864251823220492L;
	// buoc 1 : khoi tao Dao
	DonHangDetailDao donhangdetaildao= new DonHangDetailDao();
	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException{
		// thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		List<DonHangDetailModel> listdonhangdetail=donhangdetaildao.ShowList();
		req.setAttribute("listchitietdonhang", listdonhangdetail);
		
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/donhang/chitietdonhang.jsp");
		rq.forward(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
