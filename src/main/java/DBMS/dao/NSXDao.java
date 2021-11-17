package DBMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.model.NSXModel;
import DBMS.connection.DBConnect;

public class NSXDao {

	public static void insert(String mansx, String tennsx, String sdt) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// khai báo chuỗi truy vấn
		String sql = "{ call ap_Insert_NSX(?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// gán giá trị cho ?
			ps.setString(1, mansx);
			ps.setString(2, tennsx);
			ps.setString(3, sdt);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				System.out.println(new NSXModel(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		insert("HT","HUUTIN","0954854");
	}
}
