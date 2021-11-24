package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.CartModel;
import DBMS.model.thongke.BaoCaoDonHangModel;
import DBMS.model.thongke.BaoCaoKhachHangModel;
import DBMS.model.thongke.LinhKienBanChayModel;
import DBMS.model.thongke.LoaiBanChayModel;

public class ThongKeDao {
	private Connection conn;
	PreparedStatement ps=null;
	CallableStatement cstm=null;
	ResultSet rs=null;
	
	
	public ThongKeDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public int tongDonHang() {

		String sql3="{ ? = call dbo.af_TongDonHang() }";
		try {
			
			cstm = conn.prepareCall(sql3);
			cstm.registerOutParameter(1, java.sql.Types.INTEGER);
			cstm.execute();
			return cstm.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int tongDoanhThu() {

		String sql3="{ ? = call dbo.af_TongDoanhThu() }";
		try {
			
			cstm = conn.prepareCall(sql3);
			cstm.registerOutParameter(1, java.sql.Types.INTEGER);
			cstm.execute();
			return cstm.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int tbDonHang() {

		String sql3="{ ? = call dbo.af_GTTBDonHang() }";
		try {
			
			cstm = conn.prepareCall(sql3);
			cstm.registerOutParameter(1, java.sql.Types.INTEGER);
			cstm.execute();
			return cstm.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public List<LinhKienBanChayModel> LinhKienBanChay() {

		List<LinhKienBanChayModel> list = new ArrayList<LinhKienBanChayModel>();
		String sql = "SELECT * from dbo.LinhKienBanChayNhat";
		try {
			

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new LinhKienBanChayModel(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getDate(4)));
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getInt(2));
//				System.out.println(rs.getInt(3));
//				System.out.println(rs.getDate(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;


	}
	public List<LoaiBanChayModel> LoaiLinhKienBanChay() {

		List<LoaiBanChayModel> list = new ArrayList<LoaiBanChayModel>();
		String sql = "SELECT * from dbo.LoaiLinhKienBanChayNhat";
		try {
			

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new LoaiBanChayModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<BaoCaoKhachHangModel> KhachHang() {

		List<BaoCaoKhachHangModel> list = new ArrayList<BaoCaoKhachHangModel>();
		String sql = "SELECT * from dbo.BaoCaoKhachHangCuaDonHang";
		try {			

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new BaoCaoKhachHangModel(rs.getString(1),rs.getInt(2),rs.getInt(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;

	}
	public List<BaoCaoDonHangModel> DonHang() {

		List<BaoCaoDonHangModel> list = new ArrayList<BaoCaoDonHangModel>();
		String sql = "SELECT * from dbo.BaoCaoDonHangCuaKhachHang";
		try {
			

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new BaoCaoDonHangModel(rs.getString(1),rs.getDate(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;

	}
}
