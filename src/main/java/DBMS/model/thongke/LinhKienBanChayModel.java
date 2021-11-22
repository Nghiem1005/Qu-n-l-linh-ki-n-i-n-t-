package DBMS.model.thongke;

import java.sql.Date;

public class LinhKienBanChayModel {
	private String tenLinhKien;
	private int gia;
	private int soluong;
	private Date ngaytao;
	public LinhKienBanChayModel(String tenLinhKien, int gia, int soluong, Date ngaytao) {
		super();
		this.tenLinhKien = tenLinhKien;
		this.gia = gia;
		this.soluong = soluong;
		this.ngaytao = ngaytao;
	}
	public String getTenLinhKien() {
		return tenLinhKien;
	}
	public void setTenLinhKien(String tenLinhKien) {
		this.tenLinhKien = tenLinhKien;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	
}
