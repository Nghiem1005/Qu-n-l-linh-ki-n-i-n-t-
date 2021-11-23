package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.DonHangDetailModel;

public class DonHangDetailDao {
	Connection conn=null;
	PreparedStatement ps=null;
	CallableStatement cstm=null;
	ResultSet rs=null;
	public List<DonHangDetailModel> ShowList(String madonhang)
	{
		
		List<DonHangDetailModel> listdonhangdetail = new ArrayList<DonHangDetailModel>();
		String sql="select * from up_getSanPhamByMaDonHang(?)";
		try {
			conn= new DBConnect().getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, madonhang);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				listdonhangdetail.add(new DonHangDetailModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
				
			}
			
		} catch (Exception e) {
			
		}
		return listdonhangdetail;
		
	}
	public int insert(DonHangDetailModel donhangdetail) {
		String sql = "{ call ap_Insert_ChiTietDonHang(?,?,?,?) }";
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, donhangdetail.getMadonhang());
			cstm.setString(2, donhangdetail.getMalinhkien());
			cstm.setInt(3, donhangdetail.getSoluong());
			cstm.registerOutParameter(4,java.sql.Types.INTEGER);
			
			cstm.execute();
			
			int ktra=cstm.getInt(4);
			return ktra;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public int update (DonHangDetailModel donhangdetail) {
		String sql="{ call ap_Update_ChiTietDonHang(?,?,?,?) }";
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);

			cstm.setString(1, donhangdetail.getMadonhang());
			cstm.setString(2, donhangdetail.getMalinhkien());
			cstm.setInt(3, donhangdetail.getSoluong());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(4);
			return ktra;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}
	public int delete (String madonhang, String malinhkien) {
		String sql="{ call ap_delete_ChiTietDonHang(?,?,?) }";
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, madonhang);
			cstm.setString(2, malinhkien);
			cstm.registerOutParameter(3, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(3);
			return ktra;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public DonHangDetailModel getDonHangbyMaDonHang(String madonhang,String malinhkien) {
		
		DonHangDetailModel donhangdetail = new DonHangDetailModel();
		String sql="select * from ap_get_linhkienBymagiohangmalinhkien(?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, madonhang);
			ps.setString(2, malinhkien);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				donhangdetail = new DonHangDetailModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return donhangdetail;
	}
}
