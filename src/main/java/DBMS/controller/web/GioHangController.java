package DBMS.controller.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.LoaiDao;
import DBMS.model.LoaiModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/giohang" })
public class GioHangController extends HttpServlet{
	LoaiDao cateService = new LoaiDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		List<LoaiModel> listC = cateService.getAllLoai();
		req.setAttribute("listcate", listC);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/web_giohang.jsp");
		dispatcher.forward(req, resp);
	}
}
