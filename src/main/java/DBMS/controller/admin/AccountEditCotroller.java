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
@WebServlet(urlPatterns= {"/admin/acc-edit"})
public class AccountEditCotroller extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String manguoidung = req.getParameter("manguoidung");
		String tentk = req.getParameter("tentk");
		String matkhau = req.getParameter("matkhau");
		
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		
		AccountDao accdao = new AccountDao(conn);
		AccountModel accmodel = accdao.getAccbyMaNguoiDung(manguoidung);
		
		AccountModel accmodel1 = new AccountModel(accmodel.getMatk(), tentk, matkhau, accmodel.getQuyen(),manguoidung);
		System.out.println(manguoidung);
		String alert = "";
		if (accdao.update(accmodel1) == 1) {
			resp.sendRedirect(req.getContextPath()+"/admin/nguoidung");
		}
		else {
			alert="Thất bại";
			req.setAttribute("alertmess", alert);
			req.getRequestDispatcher("/views/admin/user/edit-user.jsp").forward(req, resp);
		}
	}
}
