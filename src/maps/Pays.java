package maps;

public class Pays {
	
	 private String nom;
	 private double nbhabitant;
	 private String continent;
	
////////////////////////////////////////////////
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbhabitant() {
		return nbhabitant;
	}
	public void setNbhabitant(double nbhabitant) {
		this.nbhabitant = nbhabitant;
	}
	
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
////////////////////////////////////////////////
	
	public Pays(String nom, double nbhabitant, String continent) 
	{
		super();
		this.nom = nom;
		this.nbhabitant = nbhabitant;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbhabitant=" + nbhabitant + ", continent=" + continent + "]";
	}
	
	////////////////////////////////////////////////
	
	
	
	

}
