package DBMS.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.NSXDao;
import DBMS.dao.SanPhamDao;
import DBMS.model.NSXModel;

@WebServlet(urlPatterns = { "/admin/nsx/update" })
public class UpdateNSXController extends HttpServlet {
	
	private static final long serialVersionUID = -3300719613875424518L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NSXModel nsx = new NSXModel();

		String mansx = req.getParameter("mansx");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NSXDao nsxdao = new NSXDao(conn);
		
		nsx = nsxdao.get(mansx);
		req.setAttribute("nsx", nsx);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/NSX/edit-nsx.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String mansx = req.getParameter("mansx");
		String tennsx = req.getParameter("tennsx");
		String sdt = req.getParameter("sdt");
		
		HttpSession session  = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		NSXDao nsxdao = new NSXDao(conn);

		NSXModel nsx = new NSXModel(mansx, tennsx, sdt);
		String alert = "";
		if (nsxdao.update(nsx) == 1) {
			resp.sendRedirect(req.getContextPath() + "/admin/nsx");
		} else {
			alert = "Sửa thất bại";
			req.setAttribute("alertmess", alert);
			req.setAttribute("nsx", nsx);
			nsx =nsxdao.get(mansx);
			
			req.setAttribute("nsx", nsx);
			req.getRequestDispatcher("/views/admin/NSX/edit-nsx.jsp").forward(req, resp);
		}
	}
}
