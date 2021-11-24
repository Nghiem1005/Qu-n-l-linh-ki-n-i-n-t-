package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.DonHangDetailModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/donhangitem-add"})
public class DonHangDetailAddController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String madonhang = req.getParameter("madonhang");
		
		req.setAttribute("madonhang", madonhang);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/donhang/add-chittietdonhang.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String madonhang = req.getParameter("madonhang");
		String malinhkien = req.getParameter("malinhkien");
		String soluong = req.getParameter("soluong");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDetailDao donhangdetaildao = new DonHangDetailDao(conn);
		
		DonHangDetailModel donhangdetailmodel = new DonHangDetailModel(madonhang,malinhkien,Integer.parseInt(soluong));
		
		String alert = "";
		if (donhangdetaildao.insert(donhangdetailmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/donhang-edit?madonhang=" + madonhang);
		} else {
			alert = "Thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("madonhang", madonhang);
			req.getRequestDispatcher("/views/admin/donhang/add-chittietdonhang.jsp").forward(req, resp);
		}
	}
}
