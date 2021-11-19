package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.CartDao;
import DBMS.dao.CartItemDao;
import DBMS.model.CartItemModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/cartitem-add"})
public class CartItemAddController extends HttpServlet{
	CartItemDao cartitemdao = new CartItemDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String magiohang = req.getParameter("magiohang");
		
		req.setAttribute("magiohang", magiohang);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/giohang/add-chitietgiohang.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String magiohang = req.getParameter("magiohang");
		String malinhkien = req.getParameter("malinhkien");
		String soluong = req.getParameter("soluong");
		
		CartItemModel cartitemmodel = new CartItemModel(magiohang, malinhkien, Integer.parseInt(soluong));
		
		String alert = "";
		if (cartitemdao.insert(cartitemmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/cart-edit?idgiohang=" + magiohang);
		} else {
			alert = "Thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("magiohang", magiohang);
			req.getRequestDispatcher("/views/admin/giohang/add-chitietgiohang.jsp").forward(req, resp);
		}
	}
}
