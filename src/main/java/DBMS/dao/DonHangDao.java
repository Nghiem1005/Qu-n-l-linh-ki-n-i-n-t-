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
	public List<DonHangModel> ShowList()
	{
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
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
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
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

	public static void main(String[] args) {
		System.out.println("danh sach don hang hien tai");
		DonHangDao donhangdao = new DonHangDao();
		DonHangModel donhangmodel = donhangdao.getIdDonHang("DH01");
		System.out.println(donhangmodel);
	}
}
