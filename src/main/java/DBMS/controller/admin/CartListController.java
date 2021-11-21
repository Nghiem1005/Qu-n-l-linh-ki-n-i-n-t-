package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.CartDao;
import DBMS.model.CartModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/cart"})
public class CartListController extends HttpServlet{
	CartDao dao = new CartDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
			
		List<CartModel> listcart = dao.getAllCart();
		
		req.setAttribute("listcarts", listcart);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/giohang/list-giohang.jsp");
		rq.forward(req, resp);
	}
}
