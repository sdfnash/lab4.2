package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoCon {



	public  Connection getcon() throws ClassNotFoundException, SQLException{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
		return con;//this is for lab 4(3).
	}
}
