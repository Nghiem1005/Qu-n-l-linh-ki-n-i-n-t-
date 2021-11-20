package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.CartDao;
import DBMS.dao.CartItemDao;
import DBMS.model.CartItemModel;
import DBMS.model.CartModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/cart-edit"})
public class CartEditController extends HttpServlet{
	CartDao cartdao = new CartDao();
	CartItemDao cartitemdao = new CartItemDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String magiohang = req.getParameter("idgiohang");
		
		CartModel cart = cartdao.getGioByMaGioHang(magiohang);
		
		req.setAttribute("cart", cart);
		
		List<CartItemModel> listcartitem = cartitemdao.getSanPhamByMaGioHang(magiohang);
		
		req.setAttribute("listcartitem", listcartitem);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/giohang/chitietgiohang.jsp");
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
		if (cartdao.update(cartmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/cart");
		} else {
			alert = "Sửa thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("cart", cartmodel);
			List<CartItemModel> listcartitem = cartitemdao.getSanPhamByMaGioHang(magiohang);
			
			req.setAttribute("listcartitem", listcartitem);
			req.getRequestDispatcher("/views/admin/giohang/chitietgiohang.jsp").forward(req, resp);
		}
	}
}
