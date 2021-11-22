package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.LoaiModel;

public class LoaiDao {
	Connection conn = null;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;
	
	public List<LoaiModel> getAllLoai() {

		List<LoaiModel> list = new ArrayList<LoaiModel>();

		String sql = "{ call DSLoai }";
		try {
			conn = new DBConnect().getConnection();

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new LoaiModel(rs.getString(1), rs.getString(2)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}
}
