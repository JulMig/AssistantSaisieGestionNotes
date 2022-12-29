package gestion_donnees;

public class GestionnaireDeNote {
	
	public double calculerMoyenne(double[] listeNote) {
		double moyenne = calculerSomme(listeNote);
		return moyenne / listeNote.length;
		
	}
	
	public double calculerSomme(double[] listeNote) {
		double somme = 0;
		for(double valeur: listeNote) {
			somme += valeur;
		}
		return somme;
	}
	
	public double calculerProduitEnCroix(double valeur,double max,double newMax) {
		return (valeur*newMax)/max;
		
	}

}
