package DBMS.model;

public class AccountModel {
	private String matk;
	private String tentk;
	private String matkhau;
	private String quyen;
	private String manguoidung;
	public AccountModel() {
		super();
	}
	public AccountModel(String matk, String tentk, String matkhau, String quyen, String manguoidung) {
		super();
		this.matk = matk;
		this.tentk = tentk;
		this.matkhau = matkhau;
		this.quyen = quyen;
		this.manguoidung = manguoidung;
	}
	public String getMatk() {
		return matk;
	}
	public void setMatk(String matk) {
		this.matk = matk;
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	@Override
	public String toString() {
		return "AccountModel [matk=" + matk + ", tentk=" + tentk + ", matkhau=" + matkhau + ", quyen=" + quyen
				+ ", manguoidung=" + manguoidung + "]";
	}

}
