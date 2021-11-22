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
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		
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
        	alert = "Thất bại";
        	request.setAttribute("alertmess", alert);
        	request.getRequestDispatcher("/decorators/login.jsp").forward(request, response);
        }
        

    }
}
