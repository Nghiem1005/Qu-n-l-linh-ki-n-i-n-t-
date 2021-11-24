package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.CartDao;
import DBMS.dao.NSXDao;
import DBMS.model.NSXModel;

@WebServlet(urlPatterns = { "/admin/nsx/delete" })
public class DeleteNSXController extends HttpServlet{
	private static final long serialVersionUID = 7922691565541961928L;
	NSXModel nsx= new NSXModel();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mansx = req.getParameter("mansx");

		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");

		NSXDao nsxDao = new NSXDao(conn);
		
		NSXModel nsx=nsxDao.get(mansx);
		
		String alert = "";
		if (nsxDao.delete(mansx) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/nsx");
		} else {
			alert = "Sửa thất bại!";
			req.setAttribute("alertmess", alert);
			req.setAttribute("nsx", nsx);
			nsx =nsxDao.get(mansx);
			
			req.setAttribute("nsx", nsx);
			req.getRequestDispatcher("/views/admin/NSX/list-nsx.jsp").forward(req, resp);
		}
	}
}
