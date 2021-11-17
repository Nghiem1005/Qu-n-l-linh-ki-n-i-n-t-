package DBMS.model;

public class NguoiDungModel {
	private String manguoidung;
	private String hoten;
	private String email;
	private String sdt;
	public NguoiDungModel() {
		super();
	}
	public NguoiDungModel(String manguoidung, String hoten, String email, String sdt) {
		super();
		this.manguoidung = manguoidung;
		this.hoten = hoten;
		this.email = email;
		this.sdt = sdt;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "NguoiDungModel [manguoidung=" + manguoidung + ", hoten=" + hoten + ", email=" + email + ", sdt=" + sdt
				+ "]";
	}
	
}
