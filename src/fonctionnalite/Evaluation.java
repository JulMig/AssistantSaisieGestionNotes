package fonctionnalite;

public class Evaluation {
	private String nomEvaluation;
	private Copie modele;
	private Copie copieEleve[];
	private int nbCopie = 0;
	private int maxCopie;
	
	public Evaluation(String nomEvaluation, Copie modele, int maxCopie) {
	
		this.nomEvaluation = nomEvaluation;
		copieEleve = new Copie[maxCopie];
		this.maxCopie = maxCopie;
		this.modele = modele;
	}
	
	
	public void ajouterCopie(Copie copie) {
		if (maxCopie < nbCopie) {
			copie.setNomEvaluation(nomEvaluation);
			copieEleve[nbCopie] = copie;
			nbCopie += 1;
		}
	}
	
	public int calculerMoyenne() {
		int moyenne = 0;
		//TODO
		return moyenne;
	}
	
	public void afficherCompteRendu() {
		System.out.println(nomEvaluation + "\n\n moyenne de l'evaluation : " + calculerMoyenne());
	}
	
	public Copie copierModele(Eleve eleve) {
		Copie copie = null;
		//TODO
		return copie;
	}
	
}
