package fonctionnalite;

public class Copie {
	private float noteFinale = 0;
	
	private int nivMax;
	private int nbQuestion;
	private float coeffQuestion[];
	
	private int nivQuestion[];
	private String commentaire = "";
	private Eleve eleve;
	
	public Copie(float[] coeffQuestion, int nivMax, int nbQuestion) {
		this.coeffQuestion = coeffQuestion;
		this.nivMax = nivMax;
		this.nivQuestion = new int[nbQuestion];
		this.nbQuestion = nbQuestion;
		
		for(int i = 0; i < nbQuestion; i++) nivQuestion[i] = -1;
	}
	
	public float getNoteFinale() {
		return noteFinale;
	}
	
	public void AjouterNiveau(int numQuestion, int niveau) {
		if (niveauEstValide(niveau) && numQuestionEstValide(numQuestion)) {
			nivQuestion[numQuestion] = niveau;
			indiquer("Le niveau de la question " + numQuestion + " a été fixé à " + niveau);
		} else 
			indiquer("Le niveau de la question " + numQuestion + " n'a pas pus être fixé à " + niveau);
	}
	
	public void setCommentaire(String texte) {
		this.commentaire = texte;
	}
	
	protected void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	public void CalculerNote(){
		if (copieEstComplete()) {
			for(int i = 0; i < nbQuestion; i++)
				noteFinale += (nivQuestion[i]  * coeffQuestion[i]) / nivMax; 
			
			indiquer("La note finale est " + noteFinale);
		} else
			indiquer("La note finale n'a pas pu être calculé, vérifiez que tout les niveaux on était rentré");
		
		
	}
	
	// Fonctions d'affichage
	
	private void indiquer(String texte) {
		System.out.println("Copie de " + eleve.getNom() + " " + eleve.getPrenom() + ": " + texte);
	}
	
	private String genererCompteRendu() {
		String compteRendu = "";
		for(int i = 0; i < nbQuestion; i++) 
			compteRendu += "Question " + i + ": " + nivQuestion[i] + "/" + nivMax + "\n";
		
		
		return compteRendu;
	}
	
	public void afficherCompteRendu() {
		if (copieEstComplete()) {
			System.out.println(eleve.getNom() + " " + eleve.getPrenom() + "\n\n");
			System.out.println(genererCompteRendu());
			System.out.println("\n\nNote Finale: " + noteFinale);
			System.out.println("\n\nCommentaire: \n" + commentaire);
	
		}
	}
	
	// Fonctions servant à vérifier les différentes conditions requises pour lancer les autres fonctions
	
	private boolean niveauEstValide(int niveau) {
		return (niveau >= 0) && (niveau <= nivMax); 
		
	}
	
	private boolean numQuestionEstValide(int numQuestion) {
		return (numQuestion > 0) && (numQuestion < nbQuestion);
	}
	
	private boolean copieEstComplete() {
		for(int i = 0; i < nbQuestion; i++) 
			if (nivQuestion[i] == -1) return false;
		
	    return eleve != null;
		
		
	}
	
	
}
