package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/sanpham-search"})
public class SanPhamSearchController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text.html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		SanPhamDao sanphamdao = new SanPhamDao(conn);
		
		String txtsearch = req.getParameter("txtsearch");
		
		List<SanPhamModel> listlinhkiensearch = sanphamdao.TimKiemLinhKienbyTenLinhKien(txtsearch);
		
		// thiet lap du lieu len jsp
		req.setAttribute("listlinhkiensearch", listlinhkiensearch);
		req.setAttribute("txtS", txtsearch);
		req.getRequestDispatcher("/views/web/web_product.jsp").forward(req, resp);
		
		
	}
}
