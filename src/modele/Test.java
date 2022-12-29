package modele;
import fonctionnalite.Eleve;
import fonctionnalite.Classe;
import fonctionnalite.Copie;
import fonctionnalite.EleveHandicape;
import fonctionnalite.Evaluation;
import gestion_donnees.GestionnaireDeNote;

public class Test {
	
	private static void test_moyenne() {
		GestionnaireDeNote gestion = new GestionnaireDeNote();
		
		assert gestion.calculerMoyenne(new double[] {2.0,10.0}) ==  6.0;
		assert gestion.calculerMoyenne(new double[] {10.0, 20.0, 3.0}) == 11.0;
		assert gestion.calculerMoyenne(new double[] {3.0, 9.33, 10.2}) != 8.8298;
	}
	
	public static void main(String[] args) {
		test_moyenne();
		
		
	}

}
