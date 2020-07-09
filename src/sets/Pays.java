package sets;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class Pays {
	
	////// Attribut /////////////////////////
	private String nom;
	private double nbHabitants;
	private double pibHabitants;

	
	////// Constructeur /////////////////////////
	
	public Pays(String nom, double nbHabitants, double pibHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitants = pibHabitants;
	}


	@Override
	public String toString() {
		return "Pays nom=" + nom + ", nbHabitants=" + nbHabitants + "Millions, pibHabitants=" + pibHabitants + "USD";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	public double getPibHabitants() {
		return pibHabitants;
	}


	public void setPibHabitants(double pibHabitants) {
		this.pibHabitants = pibHabitants;
	}


	public boolean equals(Object object) 
	{
		if (!(object instanceof Pays)) 
		{
		return false;
		}
		Pays other = (Pays) object;
		return new EqualsBuilder().append(nom, other.getNom()).isEquals();
	}
	
	
	
	
	
	
}