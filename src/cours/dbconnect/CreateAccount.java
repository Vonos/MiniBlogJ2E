package cours.dbconnect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><body>");
		out.println("  <form method=\"POST\">");
		out.println("    <label>Firstname:\t<input type=\"firstname\" name=\"firstname\" required=\"true\" /></label><br />");
		out.println("    <label>Lastname:\t<input type=\"lastname\" name=\"lastname\" required=\"true\" /></label><br />");
		out.println("    <label>mail:\t<input type=\"email\" name=\"mail\" required=\"true\" /></label><br />");
		out.println("    <label>mot de passe:\t<input type=\"password\" name=\"password\" required=\"true\" /></label><br />");
		out.println("    <input type=\"submit\" value=\"Connect\" />");
		out.println("  </form>");
		out.println("<li><a class=\"active_\" href=\"CreateAccount\">View Personal Information</a></li>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
