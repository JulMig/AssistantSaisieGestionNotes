package fonctionnalite;
import gestion_donnees.GestionnaireDeNote;

public class Classe extends GestionnaireDeNote{
	private String matiere;
	private String professeur;
	
	private Eleve[] eleves;
	
	public Classe(String matiere, String professeur, Eleve[] eleves) {
		super();
		this.matiere = matiere;
		this.professeur = professeur;
		this.eleves = eleves;
	}
	
	
	public String getMatiere() {
		return matiere;
	}

	public String getProfesseur() {
		return professeur;
	}
	
	private double[] listerMoyenneEleve() {
		double[] listeMoyenne = new double[eleves.length];
		
		for(int i = 0; i < eleves.length; i++) {
			listeMoyenne[i] = eleves[i].calculerMoyenne();
		}
		return listeMoyenne;
	}


	public double calculerMoyenne() {
		return super.calculerMoyenne(listerMoyenneEleve());
	}
	
	public void afficherCompteRendu() {
		System.out.println(matiere + "\nProfesseur: " + professeur + "\n\nEleves:");
		for (int i = 0; i < eleves.length; i++) {
			System.out.println("-" + eleves[i].getNom() + " " + eleves[i].getPrenom());
		}
		System.out.println("\nMoyenne de la classe: " + calculerMoyenne() + "/20");
	}
	

}
