package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NSXDao;
import DBMS.model.NSXModel;

@WebServlet(urlPatterns = { "/admin/nsx/list" })
public class NSXListController {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NSXDao nsxDao = new NSXDao();
		
		List<NSXModel> listnsx = nsxDao.getAllNSX();
		System.out.println(listnsx);
		req.setAttribute("listnsx", listnsx);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/nsxlist.jsp");
		rq.forward(req, resp);
	}
}
