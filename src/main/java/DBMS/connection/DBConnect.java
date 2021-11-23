package DBMS.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private final String serverName = "localhost";
<<<<<<< HEAD

	private final String dbName = "QuanLyLinhKietMayTinh";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";

	private final String password = "123456";


=======

	private final String dbName = "HQT_tuan08";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "nghiem10052001";

>>>>>>> 269d266b9e2e60a1b93dda7e322f6d1bd2fcd3a5
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