package DBMS.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBMS.connection.DBConnect;
import DBMS.model.CartModel;
import DBMS.model.DonHangModel;

public class CartDao {
	Connection conn = null;
	PreparedStatement ps = null;
	CallableStatement cstm = null;
	ResultSet rs = null;

	public int insert(CartModel cart) {
		String sql = "{ call ap_Insert_Cart (?, ?, ?) }";

		try {
			conn = new DBConnect().getConnection();
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

	/*public static void main(String[] args) {
		CartDao dao = new CartDao();
		CartModel model = new CartModel("GH06", "N01");
		int a = dao.insert(model);
		System.out.println(a);
	}*/
}
