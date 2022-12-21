package fonctionnalite;

public class Copie {
	private int noteFinale = 0;
	
	private int nivMax;
	private int nbQuestion;
	private int coeffQuestion[];
	
	private int nivQuestion[];
	private String commentaire;
	private Eleve eleve;
	
	public Copie(int[] coeffQuestion, int nivMax, int nbQuestion) {
		this.coeffQuestion = coeffQuestion;
		this.nivMax = nivMax;
		this.nivQuestion = new int[nbQuestion];
		this.nbQuestion = nbQuestion;
	}
	
	public int getNoteFinale() {
		noteFinale = 0;
		//TODO
		return noteFinale;
		
	}
	
	public void AjouterNiveau(int numQuestion) {
		
	}
	
	public void setCommentaire(String texte) {
		this.commentaire = texte;
	}
	
	protected void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	public void CalculerNote(){
		
	}
	
	private String genererCompteRendu() {
		String compteRendu = "";
		
		return compteRendu;
	}
	
	public void afficherCompteRendu() {
		System.out.println(genererCompteRendu());
	}
	
	
}
