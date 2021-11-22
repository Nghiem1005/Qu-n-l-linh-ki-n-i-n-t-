package DBMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.AccountModel;


public class AccountDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<AccountModel> getAllAccount() {
		// Khai báo List để lưu danh sách sản phẩm
		List<AccountModel> list = new ArrayList<AccountModel>();
		// khai báo chuỗi truy vấn
		String sql = "select * from Taikhoan";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				list.add(new AccountModel(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	public void insert(AccountModel account) {

		// khai báo chuỗi truy vấn
		String sql1 = "{ call Insert_Taikhoan(?,?,?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql1);
			// gán giá trị cho ?
			ps.setString(1, account.getMatk());
			ps.setString(2, account.getTentk());
			ps.setString(3, account.getMatkhau());
			ps.setString(1, account.getQuyen());
			ps.setString(1, account.getManguoidung());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(AccountModel account) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call Update_Taikhoan(?,?,?,?,?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql2);
			// gán giá trị cho ?
			ps.setString(1, account.getMatk());
			ps.setString(2, account.getTentk());
			ps.setString(3, account.getMatkhau());
			ps.setString(1, account.getQuyen());
			ps.setString(1, account.getManguoidung());
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(AccountModel account) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call Delete_Taikhoan(?) }";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql2);
			// gán giá trị cho ?
			ps.setString(1, account.getMatk());
		
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public AccountModel checkLogin(String tentk, String matkhau) {

		String sql1 = "{ call checklogin(?,?) }";
		AccountModel account = null;
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql1);
			ps.setString(1, tentk);
			ps.setString(2, matkhau);
			rs = ps.executeQuery();
			while(rs.next()) {
				account = new AccountModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}
}
