package listes2;

public class Ville {
	
	String nom;
	int nbhabitant;
	
	public Ville(String nom, int nbhabitant) {
		super();
		this.nom = nom;
		this.nbhabitant = nbhabitant;
	}
	
	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbhabitant() {
		return nbhabitant;
	}



	public void setNbhabitant(int nbhabitant) {
		this.nbhabitant = nbhabitant;
	}



	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbhabitant=" + nbhabitant + "]";
	}
	
	
	
	

}
