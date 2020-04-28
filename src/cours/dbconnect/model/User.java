package cours.dbconnect.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cours.dbconnect.UserMySQLDao;

/**
 * Represent a user as stored in the database.
 */
public class User
{
	/**
	 * The user's identifier.
	 * 
	 * Primary key.
	 */
	private int id;
	

	private String firstname;
	private String lastname;
	private String mail;
	private String password;
	
	public User() {
		
	}
	
	public void setUser(String firstname, String lastname, String mail, String password) {
		setFirstname(firstname);
		setLastname(lastname);
		setMail(mail);
		setPassword(password);
		
		
		
	}
	
	public boolean createUser(String firstname, String lastname, String mail, String password) {
		setUser(firstname,lastname,mail,password);
		
		UserMySQLDao dao = new UserMySQLDao();
		// Fetch all users from the database
		
		boolean conn = dao.creatUser(firstname,lastname, mail, password);
		
		if(conn) {
			
			
		}
		
		
		return conn;
	}
	

	public int getId() {
		return id;
	}

	public User setId(int id) {
		this.id = id;
		return this;
	}

	public String getFirstname() {
		return firstname;
	}

	public User setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public String getLastname() {
		return lastname;
	}

	public User setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public void define(HttpSession sess) {
		sess.setAttribute("id", this.id);
		sess.setAttribute("firstname", this.firstname);
		sess.setAttribute("lastname", this.lastname);
		
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
