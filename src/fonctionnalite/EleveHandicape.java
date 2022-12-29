package fonctionnalite;

public class EleveHandicape extends Eleve{
	private String handicap;
	private String amenagement;
	
	public EleveHandicape(String nom, String prenom, String handicap, String amenagement) {
		super(nom, prenom);
		this.handicap = handicap;
		this.amenagement = amenagement;
	}

	public String getAmenagement() {
		return amenagement;
	}

	public void setAmenagement(String amenagement) {
		this.amenagement = amenagement;
	}

	public String getHandicap() {
		return handicap;
	}
	
	@Override
	public void afficherCompteRendu() {
		super.afficherCompteRendu();
		System.out.println("\nHandicap(s): " + handicap + "\nAménagement(s): " + amenagement);
	}



}
