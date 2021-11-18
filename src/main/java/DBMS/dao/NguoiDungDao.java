package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.DonHangModel;
import DBMS.model.NguoiDungModel;

public class NguoiDungDao {
	public List<NguoiDungModel> ShowList() {
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		List<NguoiDungModel> listnguoidung=new ArrayList<NguoiDungModel>();
		
		// KHAI BÁO CÂU TRUY VẤN
		String sql="select * from dsnguoidungdonhang";
		try {
			conn = new DBConnect().getConnection();
			
			cstm=conn.prepareCall(sql);
			
			rs = cstm.executeQuery();
			
			while (rs.next()) {
				System.out.println(new NguoiDungModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4) ));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listnguoidung;
	}
	public static void Insert (String manguoidung,String hoten,String email,String sdt) {
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		String sql= "{ call adduser(?,?,?,?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, manguoidung);
			cstm.setString(2, hoten);
			cstm.setString(3, email);
			cstm.setString(4, sdt);
			
			rs = cstm.executeQuery();
			while(rs.next()) {
				System.out.println(new NguoiDungModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void Update(String hoten,String email,String sdt,String manguoidung) {
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		String sql= "{ call updateuser(?,?,?,?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, hoten);
			cstm.setString(2, email);
			cstm.setString(3, sdt);
			cstm.setString(4, manguoidung);
			
			rs = cstm.executeQuery();
			while(rs.next()) {
				System.out.println(new NguoiDungModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void Delete(String manguoidung) {
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		String sql= "{ call deleteuser(?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, manguoidung);
			
			rs = cstm.executeQuery();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*
	public static void main(String[] args) {
		ShowList();
		//System.out.println("Tien hanh them User");
		//Insert("KH10","Nguyen Thi Minh Anh", "minhanh@gmail.com", "03999999999");
		//Update("Nguyen Thi Minh Anh - update", "email.@gmal.com", "03999999999","KH10");
		//Delete("KH10");
	}
	*/
}
