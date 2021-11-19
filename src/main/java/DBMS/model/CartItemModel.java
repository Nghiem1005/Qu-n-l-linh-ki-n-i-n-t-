package DBMS.model;

public class CartItemModel {
	private String maGioHang;
	private String maLinhKien;
	private int soLuong;
	private int gia;
	public CartItemModel() {
		super();
	}
	public CartItemModel(String maGioHang, String maLinhKien, int soLuong, int gia) {
		super();
		this.maGioHang = maGioHang;
		this.maLinhKien = maLinhKien;
		this.soLuong = soLuong;
		this.gia = gia;
	}
	
	public CartItemModel(String maGioHang, String maLinhKien, int soLuong) {
		super();
		this.maGioHang = maGioHang;
		this.maLinhKien = maLinhKien;
		this.soLuong = soLuong;
	}
	public String getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(String maGioHang) {
		this.maGioHang = maGioHang;
	}
	public String getMaLinhKien() {
		return maLinhKien;
	}
	public void setMaLinhKien(String maLinhKien) {
		this.maLinhKien = maLinhKien;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "CartItemModel [maGioHang=" + maGioHang + ", maLinhKien=" + maLinhKien + ", soLuong=" + soLuong
				+ ", gia=" + gia + "]";
	}
	
	
	
}
