package tpn7;
public class fiscalité {
    public static void main(String[] args) {
        personne p1 = new personne(1, "ben salah", "ghofrane");
        personne p2 = new personne(2, "boulares", "feriel");
       personne p3 = new personne(3, "ben mohamed", "nour");
        
        lotissement lotissement = new lotissement(10);
        lotissement.ajouter(new proprietePrivée(1, p1, "corniche", 350, 4));
        lotissement.ajouter(new villa(2, p2, "dar chaabene", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 4));
        lotissement.ajouter(new proprieteProfessionnelle(4, p3, "korba", 1000, 50, true));
        lotissement.ajouter(new proprieteProfessionnelle(5, p1, "bir bouragba", 2500, 400, false));
        
        System.out.println("Liste des proprietes dans le lotissement :");
        lotissement.afficherProprietes();
        
        System.out.println("Nombre total de pieces dans les proprietes privees : " + lotissement.getNbPieces());
        
        proprietePrivée propMoinsImpots = null;
        double minImpots = 10000;
        for (int i = 0; i < lotissement.getNombre(); i++) {
            if (lotissement.getProprieteByIndex(i) instanceof proprietePrivée) {
                double impots = lotissement.getProprieteByIndex(i).calculImpot();
                if (impots < minImpots) {
                    minImpots = impots;
                    propMoinsImpots = (proprietePrivée) lotissement.getProprieteByIndex(i);
                }
            }
        }
        if (propMoinsImpots != null) {
            System.out.println("La propriete privee qui paye le moins d'impots :");
            System.out.println("Proprietaire : " + propMoinsImpots.getResponsable());
            System.out.println("Montant des impots : " + minImpots);
        }
        
        for (int i = 0; i < lotissement.getNombre(); i++) {
            if (lotissement.getProprieteByIndex(i) instanceof Appartement) {
                Appartement app = (Appartement) lotissement.getProprieteByIndex(i);
                if (app.getAdresse().equals("Hammamet")) {
                    lotissement.supprimer(app);
                    System.out.println("L'appartement de Hammamet a ete supprime.");
                    break;
                }
            }
        }
        System.out.println("Liste des proprietes dans le lotissement apres suppression :");
        lotissement.afficherProprietes();
		
		
		
		LotissementPrivee lt = new LotissementPrivee(10);

		lt.ajouter(new proprieteProfessionnelle(5, p1, "bir bouragba", 2500, 400, false));
		lt.ajouter(new villa(2, p2, "Beni khiar", 400, 6, true));
		
		System.out.println("Liste des proprietes de lotissement :");
		lt.afficherProprietes();

		System.out.println("Nombre total de pieces dans les proprietes privees : " + lt.getNbPieces());

		
		for (int i = 0; i < lt.getNombre(); i++) {
			if (lt.getProprieteByIndex(i) instanceof proprietePrivée) {
				double impots = lt.getProprieteByIndex(i).calculImpot();
				if (impots < minImpots) {
					minImpots = impots;
					propMoinsImpots = (proprietePrivée) lt.getProprieteByIndex(i);
				}
			}
		}
		if (propMoinsImpots != null) {
			System.out.println("La propriete privee qui paye le moin :");
			System.out.println("Proprietaire : " + propMoinsImpots.getResponsable());
			System.out.println("Montant des impots : " + minImpots);
		}

		for (int i = 0; i < lt.getNombre(); i++) {
			if (lt.getProprieteByIndex(i) instanceof villa) {
				villa app = (villa) lt.getProprieteByIndex(i);
				if (app.getAdresse().equals("Dar Chaabane")) {
					lt.supprimer(app);
					System.out.println("Villa de Dar Chabaane supprimé");
					break;
				}
			}
		}

		System.out.println("Liste des proprietes dans le lotissement apres la suppression :");
		lt.afficherProprietes();



   
	}
}