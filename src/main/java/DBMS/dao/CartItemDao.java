package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBMS.connection.DBConnect;
import DBMS.model.CartItemModel;
import DBMS.model.CartModel;

public class CartItemDao {
	private Connection conn;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;
	
	public CartItemDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public List<CartItemModel> getSanPhamByMaGioHang(String id) {

		List<CartItemModel> listcart = new ArrayList<CartItemModel>();

		String sql = "select * from ap_getSanPhamByMaGioHang(?)";
		try {
			

			ps = conn.prepareStatement(sql);
			
			ps.setString(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				listcart.add(new CartItemModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return listcart;

	}
	
	public int insert(CartItemModel cartitem) {
		String sql = "{ call ap_Insert_Chitietgiohang (?, ?, ?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, cartitem.getMaGioHang());
			cstm.setString(2, cartitem.getMaLinhKien());
			cstm.setInt(3, cartitem.getSoLuong());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(4);
			return ktra;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int update(CartItemModel cartitem) {
		String sql = "{ call ap_Update_ChiTietGioHang (?, ?, ?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, cartitem.getMaGioHang());
			cstm.setString(2, cartitem.getMaLinhKien());
			cstm.setInt(3, cartitem.getSoLuong());
			cstm.registerOutParameter(4, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(4);
			return ktra;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public CartItemModel getGioByMaGioHang(String magiohang, String malinhkien) {

		CartItemModel cartitem = new CartItemModel();

		String sql = "select * from ap_get_linhkienBymagiohangmalinhkien(?, ?)";
		try {
			

			ps = conn.prepareStatement(sql);
			
			ps.setString(1, magiohang);
			ps.setString(2, malinhkien);

			rs = ps.executeQuery();

			while (rs.next()) {
				cartitem = new CartItemModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return cartitem;

	}
	
	public int delete(String magiohang, String malinhkien) {
		String sql = "{ call ap_delete_ChiTietGioHang (?, ?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, magiohang);
			cstm.setString(2, malinhkien);

			cstm.registerOutParameter(3, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(3);
			return ktra;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
