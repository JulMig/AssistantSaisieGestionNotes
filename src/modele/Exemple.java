package modele;
import fonctionnalite.Eleve;
import fonctionnalite.Classe;
import fonctionnalite.Copie;
import fonctionnalite.EleveHandicape;
import fonctionnalite.Evaluation;

public class Exemple {
	
	public static void main(String[] args) {
		
		Eleve eleve1 = new Eleve("nom1", "prenom1");
        EleveHandicape eleve2 = new EleveHandicape("nom2", "prenom2", "dyspraxie", "tiers-temps");
		
		double[] coeffQuestion = {2, 3.5, 4.5};
		
		Copie eval1 = new Copie("TP1", coeffQuestion, 5, 3);
		Copie eval2 = new Copie("Evaluation math", coeffQuestion, 5, 3);
		
		eleve1.ajouterCopie(eval1);
		eleve1.ajouterCopie(eval2);
		
		eleve1.afficherCompteRendu();
		
		//les notes sont toute a 0 par defaut
		System.out.println("\n__________\n");
		
		eval1.ajouterNiveau(1, 0);
		eval1.ajouterNiveau(2, 6);
		eval1.ajouterNiveau(3, 0);
		
		eval2.ajouterNiveau(1, 5);
		eval2.ajouterNiveau(3, 5);
		
		System.out.println("\n__________\n");
		
		eleve1.afficherCompteRendu();
		//Les notes de s'affiche pas correctement en effet la note finale n'est pas calculé
		
		System.out.println("\n__________\n");
		
		eval1.calculerNote();
		eval2.calculerNote();
		
		//pour calculer les notes d'une evaluation tout les niveaux doivent avoir était entré correctement
		
		eval1.ajouterNiveau(2, 3);
		eval2.ajouterNiveau(2, 5);
		
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
		
		
		System.out.println("\n////////////////////////////////////////////////////////\n");
		
		Eleve eleve3 = new Eleve("nom3", "prenom3");
		Eleve[] eleves = {eleve1, eleve2, eleve3};
		Classe classe = new Classe("électronique", "Mr prof", eleves);
		
		classe.afficherCompteRendu();
		
		System.out.println("\n////////////////////////////////////////////////////////\n");
		//notre eleve1 possède deux évaluations et on souhaite pouvoir faire passer la première évaluation  au deux autre élèves
		
		Copie modeleEval1 = new Copie("TP1", coeffQuestion, 5, 3);
		Evaluation tp1 = new Evaluation("TP1: Etude de fibre optique", modeleEval1, 3);
		
		//On peut maintenant creer des copie pour chaque eleve a partir du modele
		Copie copie2 = tp1.copierModele(eleve2);
		Copie copie3 = tp1.copierModele(eleve3);
		
		//La copie s'ajoute automatiquement au copie de l'élève et au groupe d'évaluation
		//On peut également ajouter la copie de l'élève 1 au groupe d'évaluation, cela mettra a jour le nom de l'évaluation
		//Les copies sont bien indépendantes les une des autres
		tp1.ajouterCopie(eval1);
		
		tp1.afficherCompteRendu();
		
		copie2.ajouterNiveau(1, 5);
		copie2.ajouterNiveau(2, 5);
		copie2.ajouterNiveau(3, 5);
		copie3.ajouterNiveau(1, 0);
		copie3.ajouterNiveau(2, 4);
		copie3.ajouterNiveau(3, 3);
		copie2.calculerNote();
		copie3.calculerNote();
		
		System.out.println("\n__________\n");
		eleve1.afficherCompteRendu();
		System.out.println("\n__________\n");
		eleve2.afficherCompteRendu();
		System.out.println("\n__________\n");
		eleve3.afficherCompteRendu();
		System.out.println("\n__________\n");
		tp1.afficherCompteRendu();
		System.out.println("\n__________\n");
		classe.afficherCompteRendu();
		
		//On peut creer des liste pour utiliser les fonction de Ocamel
		
		System.out.println(classe.creerListePourOcamel() + "\n");
		System.out.println(eleve1.creerListePourOcamel() + "\n");
		System.out.println(tp1.creerListePourOcamel() + "\n");
		
		
	}

}
