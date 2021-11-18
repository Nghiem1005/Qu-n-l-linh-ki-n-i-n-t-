package DBMS.model;

public class CartModel {
	private String maGioHang;
	private String maNguoiDung;
	public CartModel() {
		super();
	}
	public CartModel(String maGioHang, String maNguoiDung) {
		super();
		this.maGioHang = maGioHang;
		this.maNguoiDung = maNguoiDung;
	}
	public String getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(String maGioHang) {
		this.maGioHang = maGioHang;
	}
	public String getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(String maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	@Override
	public String toString() {
		return "CartModel [maGioHang=" + maGioHang + ", maNguoiDung=" + maNguoiDung + "]";
	}
	
	
	
}
