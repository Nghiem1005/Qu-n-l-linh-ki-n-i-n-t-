package DBMS.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBMS.dao.DonHangDao;
import DBMS.dao.DonHangDetailDao;
import DBMS.model.AccountModel;
import DBMS.model.CartItemModel;
import DBMS.model.DonHangDetailModel;
import DBMS.model.DonHangModel;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/thanhtoan" })
public class ThanhToanController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession httpSession = req.getSession();
		Connection conn = (Connection) httpSession.getAttribute("connect");
		Object giohang = httpSession.getAttribute("giohang");
		AccountModel user = (AccountModel) httpSession.getAttribute("acc");

		DonHangDao donhangdao = new DonHangDao(conn);
		List<DonHangModel> listdonhang = donhangdao.ShowList();
		
		String madonhang = "";
		
		if (listdonhang.size() < 9) {
			madonhang = "DH0" + String.valueOf(listdonhang.size() + 1);
		} else {
			madonhang = "DH" + String.valueOf(listdonhang.size() + 1);
		}

		Date current = Date.valueOf(LocalDate.now());
		
		DonHangModel donhangmodel = new DonHangModel(madonhang, current, user.getManguoidung());

		String alert = "";
		if (donhangdao.insert(donhangmodel)==1) {
			resp.sendRedirect(req.getContextPath()+"/giohang");
		}
		

		DonHangDetailDao ctdhdao = new DonHangDetailDao(conn);
		
		
		Map<String, CartItemModel> map = extracted(giohang);
		
		Set<String> set = map.keySet();
		
		
        for (String key : set) {

        

    		
        	CartItemModel cartItem = map.get(key);
        	
        	DonHangDetailModel ctdh = new DonHangDetailModel(madonhang, cartItem.getMaLinhKien(), cartItem.getSoLuong(), cartItem.getGia());
        	ctdhdao.insert(ctdh);
        	
        	
        }
        map.clear();
        
        httpSession.setAttribute("giohang", map);
        
        
		

		resp.sendRedirect(req.getContextPath() + "/giohang");
	}
	
	@SuppressWarnings("unchecked")
	private Map<String, CartItemModel> extracted(Object obj) {
		return (Map<String, CartItemModel>) obj;
	}
}
