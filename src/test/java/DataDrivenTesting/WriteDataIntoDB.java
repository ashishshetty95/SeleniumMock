package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class WriteDataIntoDB {
	@Test
	public void writeDataTest() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement state = con.createStatement();
		String query="insert into employee_info values(101, 'Ashish', 'Puttur'), (102, 'Kiran', 'Gulbarga'), (103, 'Bhavana', 'Mandya'), (104, 'Bhumika', 'Mysore'), (105, 'Vaishnavi', 'Hubli');";
		int result=state.executeUpdate(query);
		if (result==5) {
			System.out.println("Query updated successfully");
		}
		else {
			System.out.println("Query nit updated");
		}
		con.close();
	}
}
