import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
	String db_name;
	String db_password;
	Connection con;
	String db_username;

	public ConnectionPool() {
		
	}
	
    public ConnectionPool(String u,String p) {
    	String db_username = u;
		String db_password = p;
		
	}

    public ConnectionPool(String u,String p, String dn) {
    	String db_username = u;
		String db_password = p;
		String db_name = dn;
}
    
    public Connection CreateConnectionPoolOne() {
    	String dname = "jdbc:mysql://localhost:3306/" + db_name;
    	
    	try {
			con = DriverManager.getConnection(dname, db_username, db_password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
    	
    }
 public boolean CreateConnectionTwo() {
	 String dname = "jdbc:mysql://localhost:3306/" + db_name;
	 try {
		con = DriverManager.getConnection(dname, db_username, db_password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return true;
 }
	
}
