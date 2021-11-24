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

import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;

@WebServlet(urlPatterns = {"/admin/sanpham"})
public class SanPhamListController extends HttpServlet {

	private static final long serialVersionUID = 5617703862679196693L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		SanPhamDao sanphamdao = new SanPhamDao(conn);
		
		// Su dung list chua danh sach SanPHamDao
		List<SanPhamModel> listsanpham = sanphamdao.getAllLinhKien();
		
		// thiết lập dữ liệu lên jsp
		req.setAttribute("listsanpham", listsanpham);
		
		// BUOC 4: trả về trang jsp nào
		// khi chay web, vô thư mục gốc webapp
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/product/list-product.jsp");
		rq.forward(req, resp);	
				
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
