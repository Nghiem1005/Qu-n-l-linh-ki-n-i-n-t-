package DBMS.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private final String serverName = "DESKTOP-9LM2IAP";
	private final String dbName = "BanHang";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "nghiem10052001";
	
	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://"+serverName+":"+portNumber+"\\"+instance+";databaseName="+dbName+";user="+userID+";password="+password;
		if(instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://"+serverName+":"+portNumber+";databaseName="+dbName+";user="+userID+";password="+password;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
		
	}
	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e){System.out.println(e);}
	}
}
