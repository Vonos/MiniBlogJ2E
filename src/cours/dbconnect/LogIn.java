package cours.dbconnect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cours.dbconnect.model.User;

import java.util.List;

/**
 * Servlet implementation class User
 */
@WebServlet("/Connect")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><body>");
		out.println("  <form method=\"POST\">");
		out.println("    <label>mail:<input type=\"email\" name=\"mail\" required=\"true\" /></label><br />");
		out.println("    <label>mot de passe:<input type=\"password\" name=\"password\" required=\"true\" /></label><br />");
		out.println("    <input type=\"submit\" value=\"Connect\" />");
		out.println("  </form>");
		out.println("<li><a class=\"active_\" href=\"CreateAccount\">View Personal Information</a></li>");
		out.println("</body></html>");
		
		
		
	}
	
	
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
		
		String projectName = this.getServletContext().getContextPath();
		/*
		 * /ServletConnect
		 */
		String servletName = request.getPathInfo();
		
		/*
		 * The parameter names (here login and password) are the ones set in
		 * the input's field "name".
		 */
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		
		
		if (mail.isEmpty() || password.isEmpty()) {
		    response.sendRedirect(projectName + "/" + servletName);
		    return;
		}
		
		

		HttpSession sess = request.getSession();
		
		PrintWriter out = response.getWriter();
		
		UserMySQLDao dao = new UserMySQLDao();
		// Fetch all users from the database
		
		Boolean conn = dao.connect(sess, mail, password);
		
		
		System.out.println(sess.getAttribute("id")+" "+sess.getAttribute("firstname"));
		
		
		
		
	
		
		
		}
	
}
