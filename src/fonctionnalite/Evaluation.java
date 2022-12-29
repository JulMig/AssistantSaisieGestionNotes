package fonctionnalite;
import gestion_donnees.GestionnaireDeNote;

public class Evaluation extends GestionnaireDeNote{
	private String nomEvaluation;
	private Copie modele;
	private Copie copieEleve[];
	private int nbCopie = 0;
	private int maxCopie;
	
	public Evaluation(String nomEvaluation, Copie modele, int maxCopie) {
		super();
		this.nomEvaluation = nomEvaluation;
		copieEleve = new Copie[maxCopie];
		this.maxCopie = maxCopie;
		this.modele = modele;
		modele.setNomEvaluation(nomEvaluation);
	}
	
	
	public void ajouterCopie(Copie copie) {
		if (maxCopie > nbCopie) {
			copie.setNomEvaluation(nomEvaluation);
			copieEleve[nbCopie] = copie;
			nbCopie += 1;
		}
	}
	
	private double[] listerNote() {
		double notes[] = new double[nbCopie];
		for(int i = 0; i < nbCopie; i++) {
			notes[i] = copieEleve[i].getNoteFinaleSurVingt();
		}
		return notes;
	}
	
	public double calculerMoyenne() {
		return super.calculerMoyenne(listerNote());
	}
	
	public String creerListePourOcamel() {
		return super.creerListePourOcamel(listerNote());
	}
	
	public void afficherCompteRendu() {
		System.out.println(nomEvaluation + "\n\nMoyenne de l'evaluation : " + calculerMoyenne() + "/20");
	}
	
	public Copie copierModele(Eleve eleve) {
		Copie copie = modele.CreerModele();
		eleve.ajouterCopie(copie);
		this.ajouterCopie(copie);
		return copie;
	}
	
}
