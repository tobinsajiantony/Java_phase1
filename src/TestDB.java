import java.sql.*;
public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
    	  Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","qwerty");
    	  Statement smt = conn.createStatement();
    	  ResultSet rs = smt.executeQuery("select * from myjava.users");
    	  while(rs.next()) {
    		  System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
    	  }
    			  
      }catch (ClassNotFoundException e) {
		// TODO: handle exception
    	  e.printStackTrace();
	}
      catch (SQLException e) {
  		// TODO: handle exception
      	  e.printStackTrace();
  	}
	}

}
