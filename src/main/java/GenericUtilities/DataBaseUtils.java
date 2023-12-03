package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

import GenericUtilities.iPathConstants;

public class DataBaseUtils {
	Connection con=null;
	public void getConnection() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(iPathConstants.DBPATH, iPathConstants.DBUSERNAME, iPathConstants.DBPASSWORD);
	}
	public ResultSet executeQuery(String query) throws SQLException {
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);
		return result;
	}
	public int executeUpdate(String query) throws SQLException {
		Statement state=con.createStatement();
		int result=state.executeUpdate(query);
		return result;
	}
	public void closeConnecton() throws SQLException {
		con.close();
	}
}
