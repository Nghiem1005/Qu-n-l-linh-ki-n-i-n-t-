package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/sanpham-edit"})
public class SanPhamUpdateController extends HttpServlet {
	SanPhamDao sanphamdao = new SanPhamDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String malinhkien = req.getParameter("malinhkien");
		
		SanPhamModel sanphammodel = sanphamdao.getLinhKienbyMaLinhKien(malinhkien);
		
		req.setAttribute("listlinhkien", sanphammodel);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/product/edit-product.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String malinhkien = req.getParameter("malinhkien");
		String tenlinhkien = req.getParameter("tenlinhkien");
		String soluong = req.getParameter("soluong");
		String dongia = req.getParameter("dongia");
		String mota = req.getParameter("mota");
		String linkanh = req.getParameter("linkanh");
		String maloai = req.getParameter("maloai");
		String mansx = req.getParameter("mansx");
		
		SanPhamModel sanphammodel = new SanPhamModel(malinhkien,tenlinhkien,Integer.parseInt(soluong),Integer.parseInt(dongia),mota,linkanh,maloai,mansx);
	
		String alert = "";
		if (sanphamdao.update(sanphammodel)==1) {
			resp.sendRedirect(req.getContextPath()+"/admin/sanpham");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/product/edit-product.jsp").forward(req, resp);
		}
	}
}
