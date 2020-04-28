package cours.dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import cours.dbconnect.model.User;
import cours.dbconnect.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

public class UserMySQLDao {

	/**
	 * SQL query used to fetch users
	 */
	private static String FETCH_USERS_SQL = "SELECT id, firstname, lastname FROM user";
	/**
	 * Fetch all users from the database
	 * 
	 * @return A list of Users
	 */
	public List<User> findAll()
	{
		List<User> users = new ArrayList<User>();
		Connection connection = DbConnection.getInstance();
		Statement stmt;

		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(FETCH_USERS_SQL);
			// Loop over the database result set and create the
			// user objects.
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				users.add(u);
			}
			// Free resources
			rs.close();
			stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return users;
	}
	
	
	
	public boolean connect(HttpSession sess, String mail, String pwd) {
		
		Connection connection = DbConnection.getInstance();
		Statement stmt;
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id, firstname, lastname FROM user WHERE email='"+mail+"' AND password ='"+pwd+"'");
			
			User u = new User();
			while (rs.next()) {
				
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				
			}
			// Free resources
			rs.close();
			u.define(sess);
			stmt.close();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false;
		
		
	}
	
	
	
}
