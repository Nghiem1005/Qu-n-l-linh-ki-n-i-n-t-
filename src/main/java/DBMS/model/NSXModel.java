package DBMS.model;

public class NSXModel {
	private String mansx;
	private String tennsx;
	private String sdt;
	public NSXModel() {
		super();
	}
	public NSXModel(String mansx, String tennsx, String sdt) {
		super();
		this.mansx = mansx;
		this.tennsx = tennsx;
		this.sdt = sdt;
	}
	public String getMansx() {
		return mansx;
	}
	public void setMansx(String mansx) {
		this.mansx = mansx;
	}
	public String getTennsx() {
		return tennsx;
	}
	public void setTennsx(String tennsx) {
		this.tennsx = tennsx;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "NSXModel [mansx=" + mansx + ", tennsx=" + tennsx + ", sdt=" + sdt + "]";
	}
	
}
