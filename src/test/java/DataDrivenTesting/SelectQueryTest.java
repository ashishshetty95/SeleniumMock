package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {
	Connection con=null;
	@Test
	public void selectQueryTest() throws SQLException {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement state = con.createStatement();
			String query="Select * from employee_info;";
			ResultSet result = state.executeQuery(query);
			while (result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
