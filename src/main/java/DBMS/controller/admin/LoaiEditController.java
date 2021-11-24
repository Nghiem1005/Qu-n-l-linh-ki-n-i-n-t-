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

import DBMS.dao.CartItemDao;
import DBMS.dao.LoaiDao;
import DBMS.model.CartItemModel;
import DBMS.model.CartModel;
import DBMS.model.LoaiModel;

@WebServlet(urlPatterns = { "/admin/loai/edit" })
public class LoaiEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoaiEditController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session  = request.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		LoaiDao loaidao = new LoaiDao(conn);
		String manLoai = request.getParameter("id");
		LoaiModel loai = loaidao.getLoaiById(manLoai);
		
		request.setAttribute("loai", loai);
		RequestDispatcher rq = request.getRequestDispatcher("/views/admin/Loai/edit-loai.jsp");
		rq.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String manLoai = request.getParameter("productid");
		String tenLoai = request.getParameter("name");
		
		HttpSession session  = request.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		LoaiDao loaidao = new LoaiDao(conn);

		LoaiModel loai = new LoaiModel(manLoai, tenLoai);
		String alert = "";
		if (loaidao.update(loai) == 1) {
			response.sendRedirect(request.getContextPath() + "/admin/loai");
		} else {
			alert = "Sửa thất bại";
			request.setAttribute("alertmess", alert);

			request.getRequestDispatcher("/views/admin/giohang/add-loai.jsp").forward(request, response);
		}
		

		
	}

}
