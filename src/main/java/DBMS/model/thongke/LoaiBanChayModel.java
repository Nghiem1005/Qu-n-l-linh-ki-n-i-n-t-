package DBMS.model.thongke;

public class LoaiBanChayModel {
	private String maLinhKien;
	private String tenLinhKien;
	private String maLoai;
	private String tenLoai;
	private int tongSoLuong;
	public LoaiBanChayModel(String maLinhKien, String tenLinhKien, String maLoai, String tenLoai, int tongSoLuong) {
		super();
		this.maLinhKien = maLinhKien;
		this.tenLinhKien = tenLinhKien;
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.tongSoLuong = tongSoLuong;
	}
	public String getMaLinhKien() {
		return maLinhKien;
	}
	public void setMaLinhKien(String maLinhKien) {
		this.maLinhKien = maLinhKien;
	}
	public String getTenLinhKien() {
		return tenLinhKien;
	}
	public void setTenLinhKien(String tenLinhKien) {
		this.tenLinhKien = tenLinhKien;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public int getTongSoLuong() {
		return tongSoLuong;
	}
	public void setTongSoLuong(int tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	
	
	
	
	
}
