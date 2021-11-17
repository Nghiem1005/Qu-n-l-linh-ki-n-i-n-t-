package DBMS.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NguoiDungDao;

@WebServlet(urlPatterns= {"/nguoidung"})
public class NguoiDungController extends HttpServlet {

	private static final long serialVersionUID = -5817451576299844133L;
	// buoc 1: khoi tao DAO
	NguoiDungDao nguoidungdao = new NguoiDungDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		// lay tham so tu JSP
		
	}
}
