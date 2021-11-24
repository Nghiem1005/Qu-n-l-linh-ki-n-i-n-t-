package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import DBMS.connection.DBConnect;
import DBMS.model.LoaiModel;

public class LoaiDao {
	private Connection conn;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;

	public LoaiDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public List<LoaiModel> getAllLoai() {

		List<LoaiModel> list = new ArrayList<LoaiModel>();


		String sql = "{ call DSLoai }";
		try {

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
	public LoaiModel getLoaiById(String maLoai) {

		LoaiModel loai = new LoaiModel();
		String sql = "select * from getLoaibyMaLoai(?)";
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, maLoai);
			rs = ps.executeQuery();
			while (rs.next()) {
				loai = new LoaiModel(rs.getString(1),rs.getString(2));
			}
		} catch (Exception e) {
		}
		return loai;
	}
	public int insert(LoaiModel loai) {

		String sql = "{ call ap_Insert_Loai(?,?,?) }";
		
		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, loai.getMaLoai());
			cstm.setString(2, loai.getTenLoai());
			cstm.registerOutParameter(3, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(3);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int update(LoaiModel loai) {

		String sql = "{ call ap_Update_Loai(?,?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, loai.getMaLoai());
			cstm.setString(2, loai.getTenLoai());
			cstm.registerOutParameter(3, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(3);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int delete(String maLoai) {

		String sql = "{ call ap_delete_Loai(?, ?) }";
		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, maLoai);

			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(2);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}
}
