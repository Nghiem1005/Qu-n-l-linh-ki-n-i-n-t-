package DBMS.dao;

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
	
	public List<NSXModel> getAllNSX() {
		// Khai báo List để lưu danh sách sản phẩm
		List<NSXModel> list = new ArrayList<NSXModel>();

		// khai báo chuỗi truy vấn
		String sql = "select * from NhaSanXuat";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				list.add(new NSXModel(rs.getString(1),rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	public void insert(NSXModel nsx) {

		// khai báo chuỗi truy vấn
		String sql1 = "{ call ap_Insert_NSX(?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql1);
			// gán giá trị cho ?
			ps.setString(1, nsx.getMansx());
			ps.setString(2, nsx.getTennsx());
			ps.setString(3, nsx.getSdt());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(NSXModel nsx) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call ap_Modify_NSX(?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql2);
			// gán giá trị cho ?
			ps.setString(1, nsx.getMansx());
			ps.setString(2, nsx.getTennsx());
			ps.setString(3, nsx.getSdt());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(NSXModel nsx) {

		// khai báo chuỗi truy vấn
		String sql3 = "{ call ap_Delete_NSX(?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql3);
			// gán giá trị cho ?
			ps.setString(1, nsx.getMansx());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public NSXModel search(String tennsx)
    {
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
}
