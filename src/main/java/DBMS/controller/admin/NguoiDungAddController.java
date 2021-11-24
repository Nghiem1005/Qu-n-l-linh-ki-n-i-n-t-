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

import DBMS.dao.AccountDao;
import DBMS.dao.LoaiDao;
import DBMS.dao.NguoiDungDao;
import DBMS.model.AccountModel;
import DBMS.model.NguoiDungModel;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/admin/nguoidung-add" })

public class NguoiDungAddController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/user/add-user.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NguoiDungDao nddao = new NguoiDungDao(conn);
		AccountDao accdao = new AccountDao(conn);

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String mand = req.getParameter("manguoidung");
		String hoten = req.getParameter("hoten");
		String email = req.getParameter("email");
		String sdt = req.getParameter("sdt");
		String tentk = req.getParameter("tentk");
		String matkhau = req.getParameter("matkhau");
		String quyen  = req.getParameter("quyen");

		String matk = "";

		List<AccountModel> listacc = accdao.getAllAccount();

		if (listacc.size() < 9) {
			matk = "TK0" + String.valueOf(listacc.size() + 1);
		} else {
			matk = "TK" + String.valueOf(listacc.size() + 1);
		}

		NguoiDungModel ngdung = new NguoiDungModel(mand, hoten, email, sdt);

		AccountModel acc = new AccountModel(matk, tentk, matkhau, quyen, mand);

		String alertMsg = "";

		if (nddao.insert(ngdung, acc) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/nguoidung");
		} else {
			req.setAttribute("manguoidung", mand);
			req.setAttribute("hoten", hoten);
			req.setAttribute("email", email);
			req.setAttribute("sdt", sdt);
			req.setAttribute("tentk", tentk);
			req.setAttribute("matkhau", matkhau);
			if (nddao.insert(ngdung, acc) == 0) {
				alertMsg = "Mã người dùng này đã có";
			} else if (nddao.insert(ngdung, acc) == 2) {
				alertMsg = "Email này đã có";
			} else if (nddao.insert(ngdung, acc) == 3) {
				alertMsg = "Số điện thoại này đã có";
			} else {
				alertMsg = "Tên tài khoản này đã có";
			}
			req.setAttribute("alertmess", alertMsg);
			req.getRequestDispatcher("/views/admin/user/add-user.jsp").forward(req, resp);
		}
	}
}
