package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.LoaiDao;
import DBMS.dao.NSXDao;
import DBMS.model.CartItemModel;

@WebServlet(urlPatterns = { "/admin/loai/delete" })
public class LoaiDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	LoaiDao loaiDao = new LoaiDao();
    public LoaiDeleteController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maLoai = request.getParameter("id");
		String alert = "";
		if (loaiDao.delete(maLoai) == 1) {
			response.sendRedirect(request.getContextPath() + "/admin/loai");
		} else {
			alert = "Xóa thất bại";
			request.setAttribute("alertmess", alert);
			
			request.getRequestDispatcher("/views/admin/Loai/list-loai.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
