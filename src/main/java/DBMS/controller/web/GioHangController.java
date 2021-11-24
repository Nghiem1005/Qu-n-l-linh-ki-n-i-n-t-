package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.CartDao;
import DBMS.dao.CartItemDao;
import DBMS.dao.LoaiDao;
import DBMS.dao.SanPhamDao;
import DBMS.model.AccountModel;
import DBMS.model.CartItemModel;
import DBMS.model.CartModel;
import DBMS.model.LoaiModel;
import DBMS.model.SanPhamModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/giohang" })
public class GioHangController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();
		Connection conn = (Connection) session.getAttribute("connect");
		LoaiDao loaidao = new LoaiDao(conn);		

		List<LoaiModel> listC = loaidao.getAllLoai();
		req.setAttribute("listcate", listC);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/web_giohang.jsp");
		dispatcher.forward(req, resp);
	}
	
}
