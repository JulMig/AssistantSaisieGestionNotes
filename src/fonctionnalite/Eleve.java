package fonctionnalite;

public class Eleve {
	private String nom;
	private String prenom;
	private Copie[] copies = new Copie[50];
	private int nbCopie = 0;
	
	public Eleve(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void ajouterCopie(Copie copie) {
		if (nbCopie < 50) {
			copie.setEleve(this);
			copies[nbCopie] = copie;
			nbCopie += 1;
		}
	}
		
	public int calculerMoyenne() {
		int moyenne = 0;
		//TODO
		return moyenne;
	}
	
	public void afficherCompteRendu() {
		System.out.println(nom + " " + prenom + "\n\n");
		for(int i = 0; i < nbCopie; i++) {
			System.out.println(copies[i].getNomEvaluation() + " : " + copies[i].getNoteFinale());
			
		}
	}
	
	

}
