package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NguoiDungDao;
import DBMS.model.NguoiDungModel;

@WebServlet(urlPatterns= {"/admin/nguoidung"})
public class NguoiDungController extends HttpServlet {

	private static final long serialVersionUID = -5817451576299844133L;
	// buoc 1: khoi tao DAO
	NguoiDungDao nguoidungdao = new NguoiDungDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		List<NguoiDungModel> listnguoidung=nguoidungdao.ShowList();
		req.setAttribute("listnguoidung", listnguoidung);
		
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/user/list-user.jsp");
		rq.forward(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}
}
