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
	private Connection conn;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;
	
	public SanPhamDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public List<SanPhamModel> getAllLinhKien() {

		List<SanPhamModel> list = new ArrayList<SanPhamModel>();

		String sql = "{ call DSAllLinhKien }";
		try {
			

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
	public List<SanPhamModel> TimKiemLinhKienbyTenLinhKien(String txtsearch){
		
		List<SanPhamModel> listsearchlinhkien = new ArrayList<SanPhamModel>();
		
		String sql="{ call TimKiemLinhKienbyTenLinhKien(?) }";
		
		try {
			conn = new DBConnect().getConnection();
			
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, txtsearch);
			
			rs = cstm.executeQuery();
			
			while(rs.next()) {
				listsearchlinhkien.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listsearchlinhkien;
		
	}
	public int insert(SanPhamModel sanphammodel) {
		String sql="{ call ap_Insert_SanPham(?,?,?,?,?,?,?,?,?) }";
		try {
			
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
	public int update (SanPhamModel sanphammodel) {
		String sql="{ call ap_Update_LinhKien(?,?,?,?,?,?,?,?,?) }";
		try {
			
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
	public int delete (String malinhkien) {
		String sql="{ call ap_Delete_LinhKien(?,?) }";
		
		try {
			
			cstm = conn.prepareCall(sql);
			
			cstm.setString(1, malinhkien);
			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			
			cstm.execute();
			
			int ktra=cstm.getInt(2);
			return ktra;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public SanPhamModel getLinhKienbyMaLinhKien (String manlinhkien) {
		SanPhamModel sanphammodel = new SanPhamModel();
		String sql="select * from ap_get_LinhKienbyMaLinhKien(?)";
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, manlinhkien);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				sanphammodel = new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sanphammodel;
	}
	
	public int CountAll() {
		// TODO Auto-generated method stub
		int amount = 0;
		String sql = "select dbo.ap_get_tongsolinhkien()";
		try {

			

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
	
	public List<SanPhamModel> getPagingProductByCid(String cid, int index) {
		// TODO Auto-generated method stub
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "select * from ap_get_linhkiensotrangtheoloai(?, ?)";
		try {

			

			ps = conn.prepareStatement(sql);
			ps.setString(1, cid);
			ps.setInt(2, (index - 1) * 9);

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

	public int CountAllByCid(String cid) {
		// TODO Auto-generated method stub
		int amount = 0;
		String sql = "select dbo.ap_get_tongsolinhkientheoloai(?)";
		try {

			

			ps = conn.prepareStatement(sql);
			ps.setString(1, cid);

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

	

	public List<SanPhamModel> getTop4Product() {
		// Khai báo List để lưu danh sách sản phẩm
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		// khai báo chuỗi truy vấn
		String sql = "select * from newlinhkien";
		try {
			// mở kết nối database
			
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

	public SanPhamModel getProductById(String id) {
		SanPhamModel product = new SanPhamModel();

		String sql = "select * from ap_get_LinhKienbyMaLinhKien(?)";
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				product = new SanPhamModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return product;
	}

}


