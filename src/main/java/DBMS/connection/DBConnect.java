package DBMS.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private final String serverName = "localhost";
<<<<<<< HEAD

	private final String dbName = "HQT_tuan08";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "amsang2403@";

//	private final String dbName = "QuanLyLinhKietMayTinh";
//	private final String portNumber = "1433";
//	private final String instance = "";
//	private final String userID = "sa";
//	private final String password = "123456";



//	private final String dbName = "HQTCSDL";
//	private final String portNumber = "1433";
//	private final String instance = "";
//	private final String userID = "sa";
//	private final String password = "huutin392001";

=======
<<<<<<< HEAD
	private final String dbName = "QuanLyLinhKietMayTinh";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";

	private final String password = "123456";


=======
	private final String dbName = "HQTCSDL";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "huutin392001";
>>>>>>> 71ac8fec580124bfd3ff35c8b52fc43476bc3035
>>>>>>> f68c947c5e41d66d306244e0cb5e6c847994e097

	public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password); 
    }  
	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}	
	}
}