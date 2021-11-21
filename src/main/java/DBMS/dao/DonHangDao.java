package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.DonHangModel;
import DBMS.model.NguoiDungModel;


public class DonHangDao {
	Connection conn=null;
	PreparedStatement ps=null;
	CallableStatement cstm=null;
	ResultSet rs=null;
	public List<DonHangModel> ShowList()
	{
		
		List<DonHangModel> listdonhang= new ArrayList<DonHangModel>();
		
		// KHAI BÁO CÂU TRUY VẤN
		String sql="{ call up_DanhSachDonHang }";
		try {
			// MỞ KẾT NỐI DATABASE
			conn = new DBConnect().getConnection();
			// NÉM CÂU SQL
			//ps = conn.prepareStatement(sql);
			cstm = conn.prepareCall(sql);
			
			// THỰC THI CÂU SQL
			rs = cstm.executeQuery();
			// LẤY RESULTSET ĐỔI VÀO LIST
			while (rs.next()) {
				listdonhang.add(new DonHangModel(rs.getString(1),rs.getDate(2),rs.getString(3) ));
			}
			
			
		} catch (Exception e) {
			
		}
		return listdonhang;
	}
	public DonHangModel getIdDonHang(String id) {
		
		DonHangModel donhangmodel= new DonHangModel();
		
		String sql = "select * from LayMaDonHang(?) ";
		try {
			conn = new DBConnect().getConnection();
			
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			// THỰC THI CÂU SQL
			rs = ps.executeQuery();
			while (rs.next()) {
				donhangmodel = new DonHangModel(rs.getString(1),rs.getDate(2),rs.getString(3));
				
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return donhangmodel;
		
	}
	// THÊM ĐƠN HÀNG MỚI
	public int insert (DonHangModel donhangmodel) {
		
		String sql1= "{ call ap_Insert_Donhang(?,?,?,?) }";
		try {
			conn = new DBConnect().getConnection();
			
			cstm = conn.prepareCall(sql1);
			
			cstm.setString(1, donhangmodel.getMadonhang());
			cstm.setDate(2, (java.sql.Date) donhangmodel.getNgaytao());
			cstm.setString(3, donhangmodel.getManguoidung());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			
			cstm.execute();
			int ktra= cstm.getInt(4);
			return ktra;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	// SỬA THÔNG TIN ĐƠN HÀNG
		public int update (DonHangModel donhangmodel) {
			
			String sql1= "{ call ap_Update_Donhang(?,?,?) }";
			try {
				conn = new DBConnect().getConnection();
				
				cstm = conn.prepareCall(sql1);
				
				cstm.setString(1, donhangmodel.getMadonhang());
				//cstm.setDate(2, (java.sql.Date) donhangmodel.getNgaytao());
				cstm.setString(2, donhangmodel.getManguoidung());
				cstm.registerOutParameter(3, java.sql.Types.INTEGER);
				
				cstm.execute();
				int ktra= cstm.getInt(3);
				return ktra;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
	
	// XÓA ĐƠN HÀNG HIỆN TẠI
	public int delete(String madonhang) {
		String sql3="{ call ap_Delete_DonHang(?,?) }";
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql3);
			cstm.setString(1, madonhang);
			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			
			cstm.execute();
			int ktra= cstm.getInt(2);
			return ktra;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
/*
	public static void main(String[] args) {
		System.out.println("danh sach don hang hien tai");
		DonHangDao donhangdao = new DonHangDao();
		
		//DonHangModel kq = donhangdao.getIdDonHang("DH01");
		Date date1 = java.sql.Date.valueOf("2021-11-11");
		//int kq = donhangdao.insert(new DonHangModel("DH13",date1 , "KH01"));
		//int kq=donhangdao.delete("DH13");
		//System.out.println(kq);
		
		int kq= donhangdao.update(new DonHangModel("DH01",date1, "KH01"));
		System.out.println(kq);
	}*/
}
