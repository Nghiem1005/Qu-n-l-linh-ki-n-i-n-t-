package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.connection.DBConnect;
import DBMS.dao.AccountDao;
import DBMS.dao.NguoiDungDao;
import DBMS.model.AccountModel;
import DBMS.model.NguoiDungModel;


@WebServlet(urlPatterns= {"/signup"})
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/decorators/signup.jsp").forward(req, 
				resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String hoten = req.getParameter("hoten");
		String email = req.getParameter("email");
		String sdt = req.getParameter("sdt");
		String tentk = req.getParameter("tentk");
		String matkhau = req.getParameter("matkhau");
		
		
		
		Connection conn = null;
		try {
			conn = new DBConnect("phucnghiem", "123456").getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NguoiDungDao nddao = new NguoiDungDao(conn);
		AccountDao accdao = new AccountDao(conn);
		
		List<NguoiDungModel> listngdung = nddao.ShowList();
		
		String mand = "";
		String matk = "";
		
		if (listngdung.size() < 9) {
			mand = "N0" + String.valueOf(listngdung.size() + 1);
		} else {
			mand = "N" + String.valueOf(listngdung.size() + 1);
		}
		
		List<AccountModel> listacc = accdao.getAllAccount();
		
		if (listacc.size() < 9) {
			matk = "TK0" + String.valueOf(listacc.size() + 1);
		} else {
			matk = "TK" + String.valueOf(listacc.size() + 1);
		}
		
		NguoiDungModel ngdung = new NguoiDungModel(mand, hoten, email, sdt);
		
		AccountModel acc = new AccountModel(matk, tentk, matkhau, "user", mand);
		
		String alertMsg = "";
		
		if (nddao.insert(ngdung, acc) == 1) {
			resp.sendRedirect(req.getContextPath() + "/login");
		} else {
			
			
			req.setAttribute("hoten", hoten);
			req.setAttribute("email", email);
			req.setAttribute("sdt", sdt);
			req.setAttribute("tentk", tentk);
			req.setAttribute("matkhau", matkhau);
			if (nddao.insert(ngdung, acc) == 2) {
				alertMsg = "Email này đã có";
			} else if (nddao.insert(ngdung, acc) == 3) {
				alertMsg = "Số điện thoại này đã có";
			} else {
				alertMsg = "Tên tài khoản này đã có";
			}
			req.setAttribute("alertmess", alertMsg);
			req.getRequestDispatcher("/decorators/signup.jsp").forward(req, resp);
		}
		
	}

}
