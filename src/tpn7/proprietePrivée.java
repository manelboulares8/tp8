package tpn7;

public class proprietePrivée extends propriete {
	private int nbPieces;
	
	public proprietePrivée(int id, personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }
	
	public String toString() {
        return super.toString() + " nbPieces=" + nbPieces+"\n";
    }
	
	public double calculImpot(){
		return (getSurface() / 100) * 50 + (nbPieces * 10);
	}
	public int getNombre() {
        return nbPieces;
    }
	
}