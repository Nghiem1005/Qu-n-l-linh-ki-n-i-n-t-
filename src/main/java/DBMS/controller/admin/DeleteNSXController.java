package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NSXDao;

@WebServlet(urlPatterns = { "/admin/nsx/delete" })
public class DeleteNSXController extends HttpServlet{
	private static final long serialVersionUID = 7922691565541961928L;
	NSXDao nsxDao = new NSXDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mansx = req.getParameter("mansx");
		
		nsxDao.delete(mansx);
		
		resp.sendRedirect(req.getContextPath() + "/admin/nsx");
	}
}
