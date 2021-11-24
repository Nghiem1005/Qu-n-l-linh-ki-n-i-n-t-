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

import DBMS.dao.AccountDao;
import DBMS.dao.NguoiDungDao;
import DBMS.model.AccountModel;
import DBMS.model.NguoiDungModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/admin/nguoidung-edit" })
public class NguoiDungEditController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String manguoidung = req.getParameter("manguoidung");

		HttpSession session = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NguoiDungDao nguoidungdao = new NguoiDungDao(conn);
		AccountDao accdao = new AccountDao(conn);

		AccountModel accmodel = accdao.getAccbyMaNguoiDung(manguoidung);

		req.setAttribute("account", accmodel);
		System.out.println(accmodel);

		
		NguoiDungModel nguoidungmodel = nguoidungdao.getNguoiDungbyMaNguoiDung(manguoidung);

		req.setAttribute("nguoidung", nguoidungmodel);

		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/user/edit-user.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String manguoidung = req.getParameter("manguoidung");
		String hoten = req.getParameter("hoten");
		String email = req.getParameter("email");
		String sdt = req.getParameter("sdt");
		String tentk = req.getParameter("tentk");
		String matkhau = req.getParameter("matkhau");

		HttpSession session = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NguoiDungDao nguoidungdao = new NguoiDungDao(conn);

		NguoiDungModel nguoidungmodel = new NguoiDungModel(manguoidung, hoten, email, sdt);

		String alert = "";
		if (nguoidungdao.update(nguoidungmodel) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/nguoidung");
		} else {
			alert = "Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/user/edit-user.jsp").forward(req, resp);
		}
		
		/*AccountDao accdao = new AccountDao(conn);
		AccountModel accmodel = accdao.getAccbyMaNguoiDung(manguoidung);
		accmodel.setTentk(tentk);
		accmodel.setMatkhau(matkhau);
		
		AccountModel accmodel1 = new AccountModel(accmodel.getMatk(), tentk, matkhau, accmodel.getQuyen(),manguoidung);
		System.out.println(accmodel);
		
		if (accdao.update(accmodel) == 1) {
			resp.sendRedirect(req.getContextPath()+"/admin/nguoidung");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/user/edit-user.jsp").forward(req, resp);
		}*/
	}
}
