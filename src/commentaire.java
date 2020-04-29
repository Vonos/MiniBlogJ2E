
public class commentaire {

	
	private int idcom;
	private int idpost;
	private String user;
	private String commentaire;
	commentaire boulou = new commentaire(1, 1 , "Robert", "Nul a chier roro");
	
	public commentaire(int idcome, int idposte , String Userr, String commentairee ) {
		this.idpost=idposte;
		this.idcom=idcome;
		this.user=Userr;
		this.commentaire=commentairee;
	}
	
	public int getIdcom() {
		return idcom;
	}
	public void setIdcom(int idcom) {
		this.idcom = idcom;
	}
	public int getIdpost() {
		return idpost;
	}
	public void setIdpost(int idpost) {
		this.idpost = idpost;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
