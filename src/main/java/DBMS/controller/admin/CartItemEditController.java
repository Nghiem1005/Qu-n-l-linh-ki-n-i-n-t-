package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.CartDao;
import DBMS.dao.CartItemDao;
import DBMS.model.CartItemModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/cartitem-edit"})
public class CartItemEditController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String magiohang = req.getParameter("magiohang");
		String malinhkien = req.getParameter("malinhkien");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		CartDao cartdao = new CartDao(conn);
		CartItemDao cartitemdao = new CartItemDao(conn);
		
		req.setAttribute("magiohang", magiohang);
		req.setAttribute("malinhkien", malinhkien);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/giohang/edit-chitietgiohang.jsp");
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
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		CartDao cartdao = new CartDao(conn);
		CartItemDao cartitemdao = new CartItemDao(conn);
		
		CartItemModel cartitemmodel = new CartItemModel(magiohang, malinhkien, Integer.parseInt(soluong));
		
		String alert = "";
		if (cartitemdao.update(cartitemmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/cart-edit?idgiohang=" + magiohang);
		} else {
			alert = "Sửa thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("magiohang", magiohang);
			req.setAttribute("malinhkien", malinhkien);
			req.setAttribute("soluong", soluong);
			req.getRequestDispatcher("/views/admin/giohang/edit-chitietgiohang.jsp").forward(req, resp);
		}
	}
}
