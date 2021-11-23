package DBMS.model.thongke;

import java.sql.Date;

public class BaoCaoDonHangModel {
	private String hoten;
	private Date ngaytao;
	private int soluong;
	public BaoCaoDonHangModel(String hoten, Date ngaytao, int soluong) {
		super();
		this.hoten = hoten;
		this.ngaytao = ngaytao;
		this.soluong = soluong;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
}
