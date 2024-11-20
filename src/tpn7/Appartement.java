package tpn7;
public class Appartement extends proprietePrivée {
	private int numEtage;
	
	public Appartement(int id, personne responsable, String adresse, double surface, int nbPieces, int numEtage) {
        super(id, responsable, adresse, surface, nbPieces);
        this.numEtage = numEtage;
    }
	
	public String toString() {
        return super.toString() + ", numEtage=" + numEtage;
    }
}