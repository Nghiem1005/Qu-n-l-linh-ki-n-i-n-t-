package DBMS.model;

import java.util.Date;

public class DonHangModel {
	private String madonhang;
	private Date ngaytao;
	private String manguoidung;
	public DonHangModel() {
		super();
	}
	public DonHangModel(String madonhang, Date ngaytao, String manguoidung) {
		super();
		this.madonhang = madonhang;
		this.ngaytao = ngaytao;
		this.manguoidung = manguoidung;
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	@Override
	public String toString() {
		return "DonHangModel [madonhang=" + madonhang + ", ngaytao=" + ngaytao + ", manguoidung=" + manguoidung + "]";
	}
	
}
