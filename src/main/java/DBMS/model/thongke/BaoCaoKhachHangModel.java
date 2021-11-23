package DBMS.model.thongke;

public class BaoCaoKhachHangModel {
	private String hoten;
	private int thanhtien;
	private int soLuongDon;
	public BaoCaoKhachHangModel(String hoten, int thanhtien, int soLuongDon) {
		super();
		this.hoten = hoten;
		this.thanhtien = thanhtien;
		this.soLuongDon = soLuongDon;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	public int getSoLuongDon() {
		return soLuongDon;
	}
	public void setSoLuongDon(int soLuongDon) {
		this.soLuongDon = soLuongDon;
	}
	
}
