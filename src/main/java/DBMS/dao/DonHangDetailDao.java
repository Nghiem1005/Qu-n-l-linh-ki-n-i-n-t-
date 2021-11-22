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
	public List<DonHangDetailModel> ShowList(String madonhang)
	{
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		
		List<DonHangDetailModel> listdonhangdetail = new ArrayList<DonHangDetailModel>();
		String sql="{ call up_DanhSachDonHangNguoiDung(?) }";
		try {
			conn= new DBConnect().getConnection();
			cstm= conn.prepareCall(sql);
			cstm.setString(1, madonhang);
			
			rs = cstm.executeQuery();
			while(rs.next()) {
				listdonhangdetail.add(new DonHangDetailModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
				
			}
			
		} catch (Exception e) {
			
		}
		return listdonhangdetail;
		
	}
}
