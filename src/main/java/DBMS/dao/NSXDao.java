package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.model.NSXModel;
import DBMS.connection.DBConnect;

public class NSXDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	CallableStatement cstm = null;

	public List<NSXModel> getAllNSX() {
		// Khai báo List để lưu danh sách sản phẩm
		List<NSXModel> list = new ArrayList<NSXModel>();

		// khai báo chuỗi truy vấn
		String sql = "{call DSNSX }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				list.add(new NSXModel(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	public int insert(NSXModel nsx) {

		// khai báo chuỗi truy vấn
		String sql1 = "{ call ap_Insert_NSX(?,?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			cstm = conn.prepareCall(sql1);
			// gán giá trị cho ?
			cstm.setString(1, nsx.getMansx());
			cstm.setString(2, nsx.getTennsx());
			cstm.setString(3, nsx.getSdt());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			// chạy câu query và nhận kết quả
			cstm.execute();

			int ktra = cstm.getInt(4);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(NSXModel nsx) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call ap_Modify_NSX(?,?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			cstm = conn.prepareCall(sql2);
			// gán giá trị cho ?
			cstm.setString(1, nsx.getMansx());
			cstm.setString(2, nsx.getTennsx());
			cstm.setString(3, nsx.getSdt());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			// chạy câu query và nhận kết quả
			cstm.execute();

			int ktra = cstm.getInt(4);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(String mansx) {

		// khai báo chuỗi truy vấn
		String sql3 = "{ call ap_Delete_NSX(?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			cstm = conn.prepareCall(sql3);
			// gán giá trị cho ?
			cstm.setString(1, mansx);
			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			// chạy câu query và nhận kết quả
			cstm.execute();

			int ktra = cstm.getInt(2);
			return ktra;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public NSXModel search(String tennsx) {
		String sql4 = "{ call timnsx(?) }";
		NSXModel nsx = new NSXModel();
		try {
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql4);
			// gán giá trị cho ?
			ps.setString(1, nsx.getTennsx());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();

			return nsx;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public NSXModel get(String mansx) {
		NSXModel nsx = new NSXModel();
		String sql = "Select * from getNSXbymamsx(?)";

		try {
			conn = new DBConnect().getConnection();

			ps = conn.prepareStatement(sql);

			ps.setString(1, mansx);

			rs = ps.executeQuery();

			while (rs.next()) {
				nsx = new NSXModel(rs.getString(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nsx;
	}
}
