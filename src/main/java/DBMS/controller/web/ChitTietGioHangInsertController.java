package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.CartItemDao;
import DBMS.dao.SanPhamDao;
import DBMS.model.CartItemModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/insert_chitietgiohang" })
public class ChitTietGioHangInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		SanPhamDao sanphamdao = new SanPhamDao(conn);
		CartItemDao giohangdao  = new CartItemDao(conn);
		
		Object obj = session.getAttribute("giohang");
		
		
			Map<String, CartItemModel> map = extracted(obj);
			
			Set<String> set = map.keySet();
			
			
	        for (String key : set) {
	        	System.out.println(key);
	        	
	        	CartItemModel cartItem = map.get(key);
	        		     
	        	giohangdao.insert(cartItem);
	        	
	        	System.out.println(cartItem);
	        }
		
		resp.sendRedirect(req.getContextPath() + "/logout");
	}

	@SuppressWarnings("unchecked")
	private Map<String, CartItemModel> extracted(Object obj) {
		return (Map<String, CartItemModel>) obj;
	}
	
	
}
