package tpn7;

public class LotissementPrivee extends lotissement {
	
    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    public boolean ajouter(propriete p) {
        if (p instanceof proprietePrivée) {
            if (nombre < MAX) {
                tabProp[nombre] = p;
                nombre++;
                return true;
            }
        }
        return false;
    }

    public propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            if (tabProp[i] instanceof proprietePrivée) {
                return tabProp[i];
            }
        }
        return null;
    }

    public int getNbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof proprietePrivée) {
                nb += ((proprietePrivée) tabProp[i]).getNombre();
            }
        }
        return nb;
    }
}