package DBMS.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.NguoiDungDao;
import DBMS.model.NguoiDungModel;

@WebServlet(urlPatterns= {"/admin/nguoidung"})
public class NguoiDungController extends HttpServlet {

	private static final long serialVersionUID = -5817451576299844133L;
	NguoiDungDao nguoidungdao = new NguoiDungDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		List<NguoiDungModel> listnguoidung=nguoidungdao.ShowList();
		req.setAttribute("listnguoidung", listnguoidung);
		
		RequestDispatcher rq=req.getRequestDispatcher("/views/admin/user/list-user.jsp");
<<<<<<< HEAD

		rq.forward(req, resp);

=======
<<<<<<< HEAD

		rq.forward(req, resp);

=======
<<<<<<< HEAD
		rq.forward(req, resp);
=======
>>>>>>> f68c947c5e41d66d306244e0cb5e6c847994e097
		rq.forward(req, resp);	
>>>>>>> 71ac8fec580124bfd3ff35c8b52fc43476bc3035
>>>>>>> 269d266b9e2e60a1b93dda7e322f6d1bd2fcd3a5


	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}
}
