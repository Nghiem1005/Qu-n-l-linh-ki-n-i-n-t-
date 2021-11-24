package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.CartDao;
import DBMS.dao.LoaiDao;
import DBMS.dao.SanPhamDao;
import DBMS.model.AccountModel;
import DBMS.model.CartItemModel;
import DBMS.model.CartModel;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/sanpham/add_sanpham" })
public class GioHangAddController extends HttpServlet{	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String pId = req.getParameter("pId");
		String soluong = req.getParameter("soluong");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		SanPhamDao sanphamdao = new SanPhamDao(conn);
		AccountModel acc = (AccountModel) session.getAttribute("acc");
		CartDao cartdao = new CartDao(conn);
		
		SanPhamModel sp = sanphamdao.getProductById(pId);
		
		CartModel cart = cartdao.getGioByMaNguoiDung(acc.getManguoidung());
		
		CartItemModel cartItem = new CartItemModel();
		cartItem.setMaGioHang(cart.getMaGioHang());
		cartItem.setMaLinhKien(pId);
		cartItem.setSoLuong(Integer.parseInt(soluong));;
		cartItem.setGia(Integer.parseInt(soluong) * sp.getDonGia());
		
		Object obj = session.getAttribute("giohang");
		Object obj1 = session.getAttribute("sanphamgiohang");
		
		
		if (obj == null) {
			Map<String, CartItemModel> map = new HashMap<String, CartItemModel>();
			List<SanPhamModel> listsp = new ArrayList<SanPhamModel>();
			map.put(sp.getMaLinhKien(), cartItem);
			listsp.add(sp);
			session.setAttribute("giohang", map);
			session.setAttribute("sanphamgiohang", listsp);
		} else {
			Map<String, CartItemModel> map = extracted(obj);
			List<SanPhamModel> listsp = extractList(obj1);
			CartItemModel existedCartItem = map.get(pId);
			if (existedCartItem == null) {
				map.put(sp.getMaLinhKien(), cartItem);
				listsp.add(sp);
			} else {
				existedCartItem.setSoLuong(existedCartItem.getSoLuong() + Integer.parseInt(soluong));
				existedCartItem.setGia(existedCartItem.getSoLuong() * sp.getDonGia());
			}

			session.setAttribute("giohang", map);
			session.setAttribute("sanphamgiohang", listsp);
		}
		
		resp.sendRedirect(req.getContextPath() + "/giohang");
	}

	@SuppressWarnings("unchecked")
	private Map<String, CartItemModel> extracted(Object obj) {
		return (Map<String, CartItemModel>) obj;
	}
	
	@SuppressWarnings("unchecked")
	private List<SanPhamModel> extractList(Object obj) {
		return (List<SanPhamModel>) obj;
	}
}
