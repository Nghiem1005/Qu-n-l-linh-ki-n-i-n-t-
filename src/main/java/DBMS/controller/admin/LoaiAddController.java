package DBMS.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.LoaiDao;
import DBMS.dao.NSXDao;
import DBMS.model.LoaiModel;
import DBMS.model.NSXModel;


@WebServlet(urlPatterns = { "/admin/loai/add" })
public class LoaiAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoaiAddController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rq = request.getRequestDispatcher("/views/admin/Loai/add-loai.jsp");
		rq.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String manLoai = request.getParameter("productid");
		String tenLoai = request.getParameter("name");

		LoaiModel loai = new LoaiModel(manLoai, tenLoai);
		LoaiDao loaiDao = new LoaiDao();
		String alert = "";
		if (loaiDao.insert(loai) == 1) {
			response.sendRedirect(request.getContextPath() + "/admin/loai");
		} else {
			alert = "Thất bại";
			request.setAttribute("alertmess", alert);
			request.getRequestDispatcher("/views/admin/Loai/add-loai.jsp").forward(request, response);
		}
		

		
	}

}
