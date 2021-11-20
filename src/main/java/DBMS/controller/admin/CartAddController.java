package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.CartDao;
import DBMS.model.CartModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/cart-add"})
public class CartAddController extends HttpServlet{
	CartDao cartdao = new CartDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/giohang/add-giohang.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String magiohang = req.getParameter("magiohang");
		String manguoidung = req.getParameter("manguoidung");
		
		CartModel cartmodel = new CartModel(magiohang, manguoidung);
		
		String alert = "";
		if (cartdao.insert(cartmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/cart");
		} else {
			alert = "Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/giohang/add-giohang.jsp").forward(req, resp);
		}
		
		
		
		
			
	}
}
