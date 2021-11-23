package DBMS.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import DBMS.dao.AccountDao;
import DBMS.model.AccountModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/login"})
public class LoginController extends HttpServlet{
	
	public static final String SESSION_USERNAME = "username";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("acc") != null) {
			resp.sendRedirect(req.getContextPath() + "/waiting");
			return;
		}

		RequestDispatcher rq = req.getRequestDispatcher("/decorators/login.jsp");

		rq.forward(req, resp);
	}
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
        String tentk = req.getParameter("user");
        String matkhau = req.getParameter("pass");
        AccountDao accDao = new  AccountDao();
        
        String alertMsq = "";
		if (tentk.isEmpty() || matkhau.isEmpty()) {
			alertMsq = "Tài khoản hoặc mật không được để trống";
			req.setAttribute("mess", alertMsq);
			req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
		}
		
		 AccountModel account = accDao.checkLogin(tentk, matkhau);
		 
        if(account != null) {
            HttpSession session = req.getSession();  
            session.setAttribute("acc",account);
            resp.sendRedirect(req.getContextPath() + "/waiting");
            
        } else {
        	alertMsq = "Tài khoản hoặc mật không chính xác";
			req.setAttribute("mess", alertMsq);
			req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
        }
        
    }
}
