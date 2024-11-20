package tpn7;

public interface GestionPropriete {
    int MAX = 100;
	
	void afficherProprietes();
	boolean ajouter(propriete p);
	boolean supprimer(propriete p);


}