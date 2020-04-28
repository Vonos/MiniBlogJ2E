package cours.dbconnect.model;

import javax.servlet.http.HttpSession;

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
	
	
}
