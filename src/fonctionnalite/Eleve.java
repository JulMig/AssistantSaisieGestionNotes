package fonctionnalite;
import gestion_donnees.GestionnaireDeNote;

public class Eleve extends  GestionnaireDeNote{
	private String nom;
	private String prenom;
	private Copie[] copies = new Copie[50];
	private int nbCopie = 0;
	
	public Eleve(String nom, String prenom) {
		super();
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
		
	private double[] listerNote() {
		double notes[] = new double[nbCopie];
		for(int i = 0; i < nbCopie; i++) {
			notes[i] = copies[i].getNoteFinaleSurVingt();
		}
		return notes;
	}
	
	public String creerListePourOcamel() {
		return super.creerListePourOcamel(listerNote());
	}
	
	public double calculerMoyenne() {
		return super.calculerMoyenne(listerNote());
	}
	
	public void afficherCompteRendu() {
		System.out.println(nom + " " + prenom + "\n");
		for(int i = 0; i < nbCopie; i++) {
			System.out.println(copies[i].getNomEvaluation() + " : " + copies[i].getNoteFinale());
			
		}
		System.out.println("\nMoyenne: " + calculerMoyenne() + "/20");
	}
	
	

}
