package examples;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Example1 {
	Connection c;
	CallableStatement cs;
	ResultSet rs;

	public Example1()  {
		
	try {
		System.out.println("attemptting to connect");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "Sammy","7770180464462");
		System.out.println("connected");
		cs = c.prepareCall("{call getAllemployees()}");
		 boolean isExecuted = cs.execute();
         
         if(isExecuted){
             
             rs = cs.getResultSet();
             
             while(rs.next()){
                 
                 System.out.print(rs.getString(1) + "\t");
                 System.out.print(rs.getString(2) + "\t");
                 System.out.print(rs.getString(3) + "\t");
                 System.out.println(rs.getString(4));
                 
                
                 
             }
             rs.close();
             cs.close();
             c.close(); 
         }
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
	}


	public static void main(String[] args) {
		new Example1();
	}

}
