package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.SanPhamModel;

public class SanPhamDao {
	Connection conn = null;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;
	
	public List<SanPhamModel> getAllLinhKien() {

		List<SanPhamModel> list = new ArrayList<SanPhamModel>();

		String sql = "{ call DSAllLinhKien }";
		try {
			conn = new DBConnect().getConnection();

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new SanPhamModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}
	public int insert(SanPhamModel sanphammodel) {
		String sql="{ call ap_Insert_SanPham(?,?,?,?,?,?,?,?,?) }";
		try {
			conn = new DBConnect().getConnection();
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, sanphammodel.getMaLinhKien());
			cstm.setString(2, sanphammodel.getTenLinhKien());
			cstm.setInt(3, sanphammodel.getSoLuong());
			cstm.setInt(4, sanphammodel.getDonGia());
			cstm.setString(5, sanphammodel.getMoTa());
			cstm.setString(6, sanphammodel.getLinkAnh());
			cstm.setString(7, sanphammodel.getMaLoai());
			cstm.setString(8, sanphammodel.getMaNSX());
			cstm.registerOutParameter(9, java.sql.Types.INTEGER);
			
			cstm.execute();
			
			int ktra=cstm.getInt(9);
			return ktra;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int CountAll() {
		// TODO Auto-generated method stub
		int amount = 0;
		String sql = "select dbo.ap_get_tongsolinhkien()";
		try {

			conn = new DBConnect().getConnection();

			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while (rs.next()) {

				amount = rs.getInt(1);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return amount;
	}

	public List<SanPhamModel> getPagingSanPham(int index) {
		// TODO Auto-generated method stub
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "select * from ap_get_linhkiensotrang(?) ";
		try {

			conn = new DBConnect().getConnection();

			ps = conn.prepareStatement(sql);
			ps.setInt(1, (index - 1) * 9);

			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new SanPhamModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> f68c947c5e41d66d306244e0cb5e6c847994e097
	/*public static void main(String[] args) {
		SanPhamDao sanphamdao = new SanPhamDao();
		List<SanPhamModel> listsanpham = sanphamdao.getAllLinhKien();
		System.out.println(listsanpham);
	}*/
<<<<<<< HEAD

=======
=======
>>>>>>> f68c947c5e41d66d306244e0cb5e6c847994e097
	public List<SanPhamModel> getTop4Product() {
		// Khai báo List để lưu danh sách sản phẩm
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		// khai báo chuỗi truy vấn
		String sql = "select * from newlinhkien";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				list.add(new SanPhamModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	public List<SanPhamModel> getBest4Product() {
		// Khai báo List để lưu danh sách sản phẩm
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		// khai báo chuỗi truy vấn
		String sql = "select * from bestlinhkien";
		try {
			// mở kết nối database
			conn = new DBConnect().getConnection();
			// Ném câu query qua SQL
			ps = conn.prepareStatement(sql);
			// chạy câu query và nhận kết quả
			rs = ps.executeQuery();
			// lấy ResultSet đổ vào list
			while (rs.next()) {
				list.add(new SanPhamModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
<<<<<<< HEAD

=======
>>>>>>> 71ac8fec580124bfd3ff35c8b52fc43476bc3035
>>>>>>> f68c947c5e41d66d306244e0cb5e6c847994e097
}
