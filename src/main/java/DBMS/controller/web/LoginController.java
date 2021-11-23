/*package DBMS.controller.web;

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
import Local.service.UserService;
import Local.service.impl.UserServiceImpl;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tentk = request.getParameter("user");
        String matkhau = request.getParameter("pass");
        AccountDao accDao = new  AccountDao();
        AccountModel account = accDao.checkLogin(tentk, matkhau);
        String alert = "";
        if(account != null) {
            HttpSession session = request.getSession();  
            session.setAttribute("userInfo",account);
            response.sendRedirect("home");
            
        } else {
        	alert = "Tháº¥t báº¡i";
        	request.setAttribute("alertmess", alert);
        	request.getRequestDispatcher("/decorators/login.jsp").forward(request, response);
        }
        
		boolean isRememberMe = false;
		
		
		String remember = req.getParameter("remember");
		 if (remember == null) {
			 isRememberMe = false;
		 } else {
			 if (remember.equals("on")) {
					isRememberMe = true;
				}
		 }
		
		
		
		String alertMsq = "";
		if (username.isEmpty() || password.isEmpty()) {
			alertMsq = "Tài khoản hoặc mật không được để trống";
			req.setAttribute("mess", alertMsq);
			req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
		}
		UserService service = new UserServiceImpl();
		AccountModel user = service.login(username, password);
		
		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("acc", user);
			
			if (isRememberMe) {
				saveRemembarMe(resp, username);
			}
			resp.sendRedirect(req.getContextPath() + "/waiting");
			
		} else {
			alertMsq = "Tài khoản hoặc mật không chính xác";
			req.setAttribute("mess", alertMsq);
			req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
		}
    }
}
*/