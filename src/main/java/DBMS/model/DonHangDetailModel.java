package DBMS.model;

public class DonHangDetailModel {
	private String madonhang;
	private String malinhkien;
	private int soluong;
	private int gia;
	public DonHangDetailModel() {
		super();
	}
	public DonHangDetailModel(String madonhang, String malinhkien, int soluong, int gia) {
		super();
		this.madonhang = madonhang;
		this.malinhkien = malinhkien;
		this.soluong = soluong;
		this.gia = gia;
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public String getMalinhkien() {
		return malinhkien;
	}
	public void setMalinhkien(String malinhkien) {
		this.malinhkien = malinhkien;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "DonHangDetail [madonhang=" + madonhang + ", malinhkien=" + malinhkien + ", soluong=" + soluong
				+ ", gia=" + gia + "]";
	}
	
	
}
