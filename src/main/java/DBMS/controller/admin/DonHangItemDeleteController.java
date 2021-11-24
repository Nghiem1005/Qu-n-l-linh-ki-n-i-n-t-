package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.DonHangDetailModel;
import DBMS.model.DonHangModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/donhangitem-delete"})
public class DonHangItemDeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String madonhang = req.getParameter("madonhang");
		String malinhkien = req.getParameter("malinhkien");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		DonHangDao donhangdao = new DonHangDao(conn);
		DonHangDetailDao donhangdetaildao = new DonHangDetailDao(conn);
		
		DonHangModel donhangmodel = donhangdao.getIdDonHang(madonhang);
		
		String alert = "";
		if (donhangdetaildao.delete(madonhang, malinhkien) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/donhang-edit?madonhang=" + madonhang);
		} else {
			alert = "Xóa thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("cart", donhangmodel);
			List<DonHangDetailModel> listdonhangdetail = donhangdetaildao.ShowList(madonhang);
			
			req.setAttribute("listcartitem", listdonhangdetail);
			req.getRequestDispatcher("/views/admin/donhang/chitietdonhang.jsp").forward(req, resp);
		}
	}
}
