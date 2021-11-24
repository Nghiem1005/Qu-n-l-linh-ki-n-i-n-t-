package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.AccountModel;


public class AccountDao {
	private Connection conn;
	PreparedStatement ps = null;
	ResultSet rs = null;
	CallableStatement cstm = null;
	
	
	public AccountDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public List<AccountModel> getAllAccount() {
		// Khai báo List để lưu danh sách sản phẩm
		List<AccountModel> list = new ArrayList<AccountModel>();
		// khai báo chuỗi truy vấn
		String sql = "select * from Taikhoan";
		try {
			// mở kết nối database
			
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
	
	public int update(AccountModel account) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call ap_Update_TaiKhoanNguoiDung(?,?,?,?) }";
		try {
			// mở kết nối database
			
			// Ném câu query qua SQL
			cstm = conn.prepareCall(sql2);
			// gán giá trị cho ?
			cstm.setString(1, account.getMatk());
			cstm.setString(2, account.getTentk());
			cstm.setString(3, account.getMatkhau());
			
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(4);
			return ktra;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public void delete(AccountModel account) {

		// khai báo chuỗi truy vấn
		String sql2 = "{ call Delete_Taikhoan(?) }";
		try {
			// mở kết nối database
			
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
			conn = new DBConnect(tentk, matkhau).getConnection();
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
	
	public AccountModel getAccbyMaNguoiDung(String manguoidung) {
		// Khai báo List để lưu danh sách sản phẩm
		AccountModel acc = new AccountModel();
		// khai báo chuỗi truy vấn
		String sql = "select * from ap_getAccbyMaNguoiDung(?)";
		try {
			// mở kết nối database
			
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			ps.setString(1, manguoidung);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				acc = new AccountModel(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return acc;
	}
	public static void main(String[] args) throws Exception {
		Connection conn  = new DBConnect("hongquan4", "12345").getConnection();
		AccountDao dao = new AccountDao(conn);
		AccountModel n = dao.getAccbyMaNguoiDung("N11");
		/*int n = dao.update(new AccountModel("TK09","tin", "1234", "user", "N11"));*/
		System.out.println(n);
	}
}
