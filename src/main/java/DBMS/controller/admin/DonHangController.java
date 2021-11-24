package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.model.DonHangModel;

@WebServlet(urlPatterns = {"/admin/donhang"})
public class DonHangController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDao donhangdao= new DonHangDao(conn);
		
		
		// Buoc 2: Sử dụng List để chứa danh sách từ DonHangDao
		List<DonHangModel> listdonhang= donhangdao.ShowList();
		
		// Bước 3: Thiết lập dữ liệu lên JSP
		req.setAttribute("listdonhang", listdonhang);
		// BUOC 4: trả về trang jsp nào
		// khi chay web, vô thư mục gốc webapp
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/donhang/list-donhang.jsp");
		rq.forward(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
