package Pro_ject;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	static Connection con;
	public static Connection create()
	{
	 try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String password="madara12";
		    con = DriverManager.getConnection(url, user, password);
			
	 }
	 catch (Exception e) {
		System.out.println(e+"came");
	}	
	
		
		return con;
	}
	
}
