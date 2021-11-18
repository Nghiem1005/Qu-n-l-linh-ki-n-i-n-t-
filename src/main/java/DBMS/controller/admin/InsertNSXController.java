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

@WebServlet(urlPatterns = { "/admin/nsx/add" })
public class InsertNSXController extends HttpServlet{
	private static final long serialVersionUID = 6445174077824797951L;
	NSXDao nsxDao = new NSXDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/NSX/add-nsx.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String mansx = req.getParameter("mansx");
		String tennsx = req.getParameter("tennsx");
		String sdt = req.getParameter("sdt");

		NSXModel nsx = new NSXModel(mansx, tennsx, sdt);
		NSXDao nsxDao = new NSXDao();
		nsxDao.insert(nsx);

		resp.sendRedirect(req.getContextPath() + "/admin/nsx");
	}
}
