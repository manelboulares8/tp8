package tpn7;

public class personne{
	private int cin ; 
	private String nom;
	private String prenom;
	
	public personne(int cin, String nom, String prenom){
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}
	 public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
	public String toString() {
        return "Personne{" +"cin=" + cin +", nom='" + nom + '\'' +", prenom='" + prenom + '\'' +'}';
	}
}