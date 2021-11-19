package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NSXDao;
import DBMS.model.NSXModel;

@WebServlet(urlPatterns = { "/admin/nsx" })
public class NSXListController extends HttpServlet{
	private static final long serialVersionUID = 9142981453560089594L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NSXDao nsxDao = new NSXDao();
		
		List<NSXModel> listnsx = nsxDao.getAllNSX();
		
		req.setAttribute("listnsx", listnsx);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/NSX/list-nsx.jsp");
		rq.forward(req, resp);
	}
}
