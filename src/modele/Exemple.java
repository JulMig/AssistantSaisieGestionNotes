package modele;
import fonctionnalite.Eleve;
import fonctionnalite.Classe;
import fonctionnalite.Copie;
import fonctionnalite.EleveHandicape;
import fonctionnalite.Evaluation;

public class Exemple {
	
	public static void main(String[] args) {
		
		Eleve eleve1 = new Eleve("nom1", "prenom1");
        EleveHandicape eleve2 = new EleveHandicape("nom2", "prenom2", "dyspractie", "tiers-temps");
		
		double[] coeffQuestion = {2, 3.5, 4.5};
		
		Copie eval1 = new Copie("TP1", coeffQuestion, 5, 3);
		Copie eval2 = new Copie("Evaluation math", coeffQuestion, 5, 3);
		
		eleve1.ajouterCopie(eval1);
		eleve1.ajouterCopie(eval2);
		
		eleve1.afficherCompteRendu();
		
		//les notes sont toute a 0 par defaut
		System.out.println("\n__________\n");
		
		eval1.AjouterNiveau(1, 0);
		eval1.AjouterNiveau(2, 6);
		eval1.AjouterNiveau(3, 0);
		
		eval2.AjouterNiveau(1, 5);
		eval2.AjouterNiveau(3, 5);
		
		System.out.println("\n__________\n");
		
		eleve1.afficherCompteRendu();
		//Les notes de s'affiche pas correctement en effet la note finale n'est pas calculé
		
		System.out.println("\n__________\n");
		
		eval1.calculerNote();
		eval2.calculerNote();
		
		//pour calculer les notes d'une evaluation tout les niveaux doivent avoir était entré correctement
		
		eval1.AjouterNiveau(2, 3);
		eval2.AjouterNiveau(2, 5);
		
		eval1.calculerNote();
		eval2.calculerNote();
		
		System.out.println("\n__________\n");
		
		eleve1.afficherCompteRendu();
		
		//On peut aussi afficher un compte rendu detaillé d'une copie et la commenter
		
		eval1.setCommentaire("A revoir");
		eval2.setCommentaire("Gros progrès, bravo!");
		
		System.out.println("\n__________\n");
		
		eval1.afficherCompteRendu();
		
		System.out.println("\n__________\n");
		
		eval2.afficherCompteRendu();
		
		//Pour un élèves en situations de handicape le compte rendu sera plus détaillé, on pourra notemment voir ses aménagements et handicaps
		
		System.out.println("\n__________\n");
		
		eleve2.afficherCompteRendu();
		
		//////////////////////////////////////////////////////
		
		System.out.println("\n////////////////////////////////////////////////////////\n");
		
		Eleve eleve3 = new Eleve("nom3", "prenom3");
		Eleve[] eleves = {eleve1, eleve2, eleve3};
		Classe classe = new Classe("électronique", "Mr prof", eleves);
		
		classe.afficherCompteRendu();
		
	}

}
