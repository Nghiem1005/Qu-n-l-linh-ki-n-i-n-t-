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
	Connection conn=null;
	PreparedStatement ps=null;
	CallableStatement cstm=null;
	ResultSet rs=null;
	public List<NguoiDungModel> ShowList() {
		
		List<NguoiDungModel> listnguoidung=new ArrayList<NguoiDungModel>();
		
		// KHAI BÁO CÂU TRUY VẤN
		String sql="select * from dsnguoidungdonhang";
		try {
			conn = new DBConnect().getConnection();
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				listnguoidung.add(new NguoiDungModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listnguoidung;
	}
	
	public NguoiDungModel getNguoiDungbyMaNguoiDung(String manguoidung) {
		NguoiDungModel nguoidungmodel = new NguoiDungModel();
		String sql="select * from ap_getNguoiDungbyMaNguoiDung(?)";
		try {
			conn = new DBConnect().getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, manguoidung);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				nguoidungmodel = new NguoiDungModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nguoidungmodel;
	}
	
	public int insert (NguoiDungModel nguoidungmodel) {
		
		String sql= "{ call ap_Insert_NguoiDung(?,?,?,?,?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1,nguoidungmodel.getManguoidung());
			cstm.setString(2, nguoidungmodel.getHoten());
			cstm.setString(3, nguoidungmodel.getEmail());
			cstm.setString(4, nguoidungmodel.getSdt());
			cstm.registerOutParameter(5, java.sql.Types.INTEGER);
			
			cstm.execute();
			int ktra= cstm.getInt(5);
			return ktra;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int update(NguoiDungModel nguoidungmodel){
		
		
		String sql= "{ call ap_Update_NguoiDung(?,?,?,?,?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1,nguoidungmodel.getManguoidung());
			cstm.setString(2, nguoidungmodel.getHoten());
			cstm.setString(3, nguoidungmodel.getEmail());
			cstm.setString(4, nguoidungmodel.getSdt());
			cstm.registerOutParameter(5, java.sql.Types.INTEGER);
			cstm.execute();
			
			int ktra= cstm.getInt(5);
			return ktra;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public int Delete(String manguoidung) {
		
		
		String sql= "{ call ap_Delete_NguoiDung(?,?) }";
		
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, manguoidung);
			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(2);
			return ktra;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/*public static void main(String[] args) {
		
		NguoiDungDao nd = new NguoiDungDao();
		//nd.ShowList();
		List<NguoiDungModel> listnd = nd.ShowList();
		System.out.println(listnd);
		
		//System.out.println("Tien hanh them User");
		//Insert("KH10","Nguyen Thi Minh Anh", "minhanh@gmail.com", "03999999999");
		//Update("Nguyen Thi Minh Anh - update", "email.@gmal.com", "03999999999","KH10");
		//Delete("KH10");
	}*/
	
}
