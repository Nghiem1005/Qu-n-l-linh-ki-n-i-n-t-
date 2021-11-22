package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

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


@WebServlet(urlPatterns = { "/admin/loai" })
public class LoaiListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoaiListController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoaiDao loaiDao = new LoaiDao();
		
		List<LoaiModel> listloai = loaiDao.getAllLoai();
		
		request.setAttribute("listloai", listloai);
		RequestDispatcher rq = request.getRequestDispatcher("/views/admin/Loai/list-loai.jsp");
		rq.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
