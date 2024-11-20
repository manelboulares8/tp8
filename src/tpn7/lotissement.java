package tpn7;

public class lotissement implements GestionPropriete {
    protected propriete[] tabProp;
    protected int nombre;
	
	public lotissement(int capacité) {
        tabProp =new propriete[capacité];
        nombre = 0; 
    }
	
	public int getNombre() {
        return nombre;
    }
	
	public void afficherProprietes() {
        for (int i=0; i<nombre;i++) {
            System.out.println(tabProp[i].toString());
        }
    }
	public boolean ajouter(propriete p)
	{
		if(nombre < MAX) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean supprimer(propriete p) {
        for (int i=0;i<nombre;i++) {
            if (tabProp[i].getId() == p.getId()) { 
                for (int j=i;j<nombre-1;j++) {
                    tabProp[j]=tabProp[j+1];
                }
                tabProp[nombre-1]=null; 
                nombre--; 
                return true; 
            }
        }
        return false; 	
    }
	public propriete getProprieteByIndex(int i) {
        if (i>=0 && i<nombre) {
            return tabProp[i];
        }
		return null;
    }
	
	public int getNbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof proprietePrivée) {
                proprietePrivée propPrivee = (proprietePrivée) tabProp[i];
                nb += propPrivee.getNombre();
            }
        }
        return nb; 
    }
	
}