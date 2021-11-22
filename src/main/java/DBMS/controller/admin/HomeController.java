package DBMS.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBMS.dao.ThongKeDao;
import DBMS.model.thongke.BaoCaoDonHangModel;
import DBMS.model.thongke.BaoCaoKhachHangModel;
import DBMS.model.thongke.LinhKienBanChayModel;
import DBMS.model.thongke.LoaiBanChayModel;




@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/admin/home","/trang-chu"})
public class HomeController extends HttpServlet{
	List<LinhKienBanChayModel> listlinhkienbanchay = new ArrayList<LinhKienBanChayModel>();
	List<LoaiBanChayModel> listloaibanchay = new ArrayList<LoaiBanChayModel>();
	List<BaoCaoKhachHangModel> listbaocaokh = new ArrayList<BaoCaoKhachHangModel>();
	List<BaoCaoDonHangModel> listbaocaodonhang = new ArrayList<BaoCaoDonHangModel>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		ThongKeDao thongkedao = new ThongKeDao();
		int tongDonHang = thongkedao.tongDonHang();
		int tongDoanhThu = thongkedao.tongDoanhThu();
		int tbDonHang = thongkedao.tbDonHang();
		
		
		listlinhkienbanchay =  thongkedao.LinhKienBanChay();
		listloaibanchay = thongkedao.LoaiLinhKienBanChay();
		listbaocaokh = thongkedao.KhachHang();
		listbaocaodonhang = thongkedao.DonHang();
		
		
		req.setAttribute("tongdonhang", tongDonHang);
		req.setAttribute("tongdoanhthu", tongDoanhThu);
		req.setAttribute("tbdonhang", tbDonHang);
		req.setAttribute("listlinhkienbanchay", listlinhkienbanchay);
		req.setAttribute("listloaibanchay", listloaibanchay);
		req.setAttribute("listbaocaokh", listbaocaokh);
		req.setAttribute("listbaocaodonhang", listbaocaodonhang);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/home.jsp");
		rq.forward(req, resp);
	}
}
