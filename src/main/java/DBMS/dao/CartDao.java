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
import DBMS.model.DonHangModel;
import DBMS.model.NSXModel;

public class CartDao {
	private Connection conn;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;
	

	public CartDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public int insert(CartModel cart) {
		String sql = "{ call ap_Insert_Cart (?, ?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, cart.getMaGioHang());
			cstm.setString(2, cart.getMaNguoiDung());
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

	public List<CartModel> getAllCart() {

		List<CartModel> list = new ArrayList<CartModel>();

		String sql = "{ call DSGioHang }";
		try {
			

			cstm = conn.prepareCall(sql);

			rs = cstm.executeQuery();

			while (rs.next()) {
				list.add(new CartModel(rs.getString(1), rs.getString(2)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}
	
	public int update(CartModel cart) {
		String sql = "{ call ap_Update_GioHang (?, ?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, cart.getMaGioHang());
			cstm.setString(2, cart.getMaNguoiDung());
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
	
	public int delete(String magiohang) {
		String sql = "{ call ap_delete_GioHang (?, ?) }";

		try {
			
			cstm = conn.prepareCall(sql);

			cstm.setString(1, magiohang);

			cstm.registerOutParameter(2, java.sql.Types.INTEGER);
			cstm.execute();
			int ktra = cstm.getInt(2);
			return ktra;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public CartModel getGioByMaGioHang(String id) {

		CartModel cart = new CartModel();

		String sql = "select * from ap_get_giohangBymagiohang(?)";
		try {
			

			ps = conn.prepareStatement(sql);
			
			ps.setString(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				cart = new CartModel(rs.getString(1), rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return cart;
	}
	
	public CartModel getGioByMaNguoiDung(String id) {

		CartModel cart = new CartModel();

		String sql = "select * from ap_getGioHangbyMaNguoiDung(?)";
		try {
			

			ps = conn.prepareStatement(sql);
			
			ps.setString(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				cart = new CartModel(rs.getString(1), rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return cart;
	}
	

}
