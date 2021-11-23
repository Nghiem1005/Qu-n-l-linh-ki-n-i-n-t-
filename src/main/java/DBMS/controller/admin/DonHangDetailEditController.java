package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.DonHangDetailModel;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/donhangitem-edit"})
public class DonHangDetailEditController extends HttpServlet {
	DonHangDao donhangdao = new DonHangDao();
	DonHangDetailDao donhangdetaildao = new DonHangDetailDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String madonhang = req.getParameter("madonhang");
		String malinhkien = req.getParameter("malinhkien");
		
		req.setAttribute("madonhang", madonhang);
		req.setAttribute("malinhkien", malinhkien);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/donhang/edit-chitietdonhang.jsp");
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
		
		DonHangDetailModel donhangdetailmodel = new DonHangDetailModel(madonhang,malinhkien,Integer.parseInt(soluong));
		
		String alert = "";
		if (donhangdetaildao.update(donhangdetailmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/donhang-edit?madonhang=" + madonhang);
		} else {
			alert = "Sửa thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("madonhang", madonhang);
			req.setAttribute("malinhkien", malinhkien);
			req.setAttribute("soluong", soluong);
			req.getRequestDispatcher("/views/admin/donhang/edit-chitietdonhang.jsp").forward(req, resp);
		}
	}
}
