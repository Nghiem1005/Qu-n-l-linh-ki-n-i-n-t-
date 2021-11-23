package DBMS.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.SanPhamDao;
import DBMS.model.SanPhamModel;


@WebServlet(urlPatterns = {"/sanpham/chitiet"})
public class ChiTietSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ChiTietSanPhamController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("p");
		SanPhamDao spdao = new SanPhamDao();
		SanPhamModel product = spdao.getProductById(id);
		request.setAttribute("product", product);
		RequestDispatcher rq = request.getRequestDispatcher("/views/web/web_productdetails.jsp");
		rq.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
