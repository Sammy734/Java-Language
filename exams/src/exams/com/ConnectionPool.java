package exams.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionPool {

	String db_username;
    String db_userpass;
    String databasename;
    Connection con;
    
   public ConnectionPool() {
 	  
   }
   
   public ConnectionPool(String u,String p) {
 	  u = db_username;
 	  p = db_userpass;
 	  
   }
   
    public ConnectionPool(String u, String p,String d) {
 	  u = db_username;
 	  p = db_userpass;
 	  d = databasename;
   }
    
    public Connection createDatabaseConnection() {
 	   String db_url = "jdbc:mysql://localhost:3306/" + databasename;
 	   
 	   
 	   
 	   try {
 		   
			con = DriverManager.getConnection(db_url, db_username, db_userpass);
		
 	   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	   
 	  return con;
 	   
    }
    
    public boolean createDatabaseConnection1() {
 	   String db_url = "jdbc:mysql://localhost:3306/" + databasename;
 	   boolean okay = false; 
 	   
 	   
 	   try {
 		   
			con = DriverManager.getConnection(db_url, db_username, db_userpass);
			okay = true;
			
			
 	   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	
}
		
 	   
 	   return okay;
 	   
    }
    
}
