package cours.dbconnect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cours.dbconnect.model.User;

import java.util.List;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		UserMySQLDao dao = new UserMySQLDao();
		// Fetch all users from the database
		List<User> users = dao.findAll();
		// Loop over them to display their informations
		for (User u: users) {
			out.print("ID: " + u.getId());
			out.print(" | Firstname: " + u.getFirstname());
			out.print(" | Lastname: " + u.getLastname());
			out.println("");
		}
		// Close the connection to the database
		DbConnection.close();
	}
	
}
