package DBMS.controller.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;

@WebServlet(urlPatterns = {"/sanpham-search"})
public class SanPhamSearchController extends HttpServlet {
	SanPhamDao sanphamdao = new SanPhamDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text.html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String txtsearch = req.getParameter("txtsearch");
		
		List<SanPhamModel> listlinhkiensearch = sanphamdao.TimKiemLinhKienbyTenLinhKien(txtsearch);
		
		// thiet lap du lieu len jsp
		req.setAttribute("listlinhkiensearch", listlinhkiensearch);
		req.setAttribute("txtS", txtsearch);
		req.getRequestDispatcher("/views/web/web_product.jsp").forward(req, resp);
		
		
	}
}
