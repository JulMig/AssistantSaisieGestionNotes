package modele;
import fonctionnalite.Eleve;
import fonctionnalite.Classe;
import fonctionnalite.Copie;
import fonctionnalite.EleveHandicape;
import fonctionnalite.Evaluation;
import gestion_donnees.GestionnaireDeNote;

public class Test {
	
	private static void testMoyenne() {
		GestionnaireDeNote gestion = new GestionnaireDeNote();
		
		assert gestion.calculerMoyenne(new double[] {2.0,10.0}) ==  6.0: "Erreur calcul de la moyenne";
		assert gestion.calculerMoyenne(new double[] {10.0, 20.0, 3.0}) == 11.0: "Erreur calcul de la moyenne";
		assert gestion.calculerMoyenne(new double[] {3.0, 9.33, 10.2}) != 8.8298: "Erreur calcul de la moyenne";
	}
	
	private static void testSomme() {
		GestionnaireDeNote gestion = new GestionnaireDeNote();
		
		assert gestion.calculerSomme(new double[] {23.5, 4.2, 2.3}) == 30.0: "Erreur calcul de la somme";
		assert gestion.calculerSomme(new double[] {10.2, 3.8}) == 14.0: "Erreur calcul de la somme";
		assert gestion.calculerSomme(new double[] {3.0}) != 0.0 : "Erreur calcul de la somme";
	}
	
	private static void testProduitEnCroix() {
		GestionnaireDeNote gestion = new GestionnaireDeNote();
		
		assert gestion.calculerProduitEnCroix(2.0, 4.0, 8.0) == 4.0: "Erreur calcul produit en croix";
		assert gestion.calculerProduitEnCroix(1.0, 1.0, 3.0) == 3.0: "Erreur calcul produit en croix";
		assert gestion.calculerProduitEnCroix(0, 0, 2.0) != 1.0: "Erreur calcul produit en croix";
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Test Moyenne");
		testMoyenne();
		System.out.println("OK\n");
		
		System.out.println("Test Somme");
		testSomme();
		System.out.println("OK\n");
		
		System.out.println("Test Produit en croix");
		testProduitEnCroix();
		System.out.println("OK\n");
		
		
		
		
	}

}
