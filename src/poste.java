
public class poste {
  
private int idpost; 	
private String contenue;
private String User;
private String date;
poste zoulou = new poste(1, "j'adore aller manger au macdo pdt le covid je me sens vraiment comme un gros fdp" , "Robert", "14 mai 2020");


public poste(int idposte, String contenuee , String Userr, String datee ) {
	this.idpost=idposte;
	this.contenue=contenuee;
	this.User=Userr;
	this.date=datee;
	 
}

public String getContenue() {
	return contenue;
}
public void setContenue(String contenue) {
	this.contenue = contenue;
}
public String getUser() {
	return User;
}
public void setUser(String user) {
	User = user;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getIdpost() {
	return idpost;
}
public void setIdpost(int idpost) {
	this.idpost = idpost;
}



}
