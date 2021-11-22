package DBMS.model;

public class SanPhamModel {
	private String maLinhKien;
	private String tenLinhKien;
	private int soLuong;
	private int donGia;
	private String moTa;
	private String linkAnh;
	private String maLoai;
	private String maNSX;
	public SanPhamModel() {
		super();
	}
	public SanPhamModel(String maLinhKien, String tenLinhKien, int soLuong, int donGia, String moTa, String linkAnh,
			String maLoai, String maNSX) {
		super();
		this.maLinhKien = maLinhKien;
		this.tenLinhKien = tenLinhKien;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.moTa = moTa;
		this.linkAnh = linkAnh;
		this.maLoai = maLoai;
		this.maNSX = maNSX;
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
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getLinhAnh() {
		return linkAnh;
	}
	public void setLinhAnh(String linkAnh) {
		this.linkAnh = linkAnh;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getMaNSX() {
		return maNSX;
	}
	public void setMaNSX(String maNSX) {
		this.maNSX = maNSX;
	}
	@Override
	public String toString() {
		return "SanPhamModel [maLinhKien=" + maLinhKien + ", tenLinhKien=" + tenLinhKien + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + ", moTa=" + moTa + ", linkAnh=" + linkAnh + ", maLoai=" + maLoai + ", maNSX="
				+ maNSX + "]";
	}
	
	
}
