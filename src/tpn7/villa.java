package tpn7;

public class villa extends proprietePrivée {
	private boolean avecPiscine;
	
	public villa(int id, personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }
	
	public String toString() {
        return super.toString() + " avecPiscine=" + avecPiscine;
    }
	
	public double calculImpot(){
		double impot = super.calculImpot();
		if (avecPiscine) {
			impot += 200;
		}
		return impot;
	}
	
}