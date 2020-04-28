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
		out.println("    <label>Inserez le mot de passe:\t<input type=\"password\" name=\"password\" required=\"true\" /></label><br />");
		out.println("    <label>Repetez le mot de passe:\t<input type=\"password\" name=\"password2\" required=\"true\" /></label><br />");
		out.println("    <input type=\"submit\" value=\"Create Account\" />");
		out.println("  </form>");
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
		
		
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		
		System.out.println(password+" "+password2);
		if (password!=password2) {
		    this.doGet(request, response);
		    return;
		}
		
		
		User newUs = new User();
		newUs.createUser(firstname, lastname, mail, password);
		HttpSession sess = request.getSession();
		newUs.define(sess);
		
	}

}
