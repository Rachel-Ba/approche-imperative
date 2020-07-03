package tri;



public class Ville implements Comparable<Ville>
{
	
	private String nom;
	int nbhabitant;
	
	public Ville(String nom, int nbhabitant) 
	{
		super();
		this.nom = nom;
		this.nbhabitant = nbhabitant;
	}
	
////////////////////GETTER SETTER//////////////////////////
	
	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public int getNbhabitant() 
	{
		return nbhabitant;
	}

	public void setNbhabitant(int nbhabitant) 
	{
		this.nbhabitant = nbhabitant;
	}

//////////////////STRING//////////////////////////////////////////////////

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbhabitant=" + nbhabitant + "]";
	}
	
///////////////////COMPARE//////////////////////////////////////
	
	///TRI PAR ORDRE ALPHABETIQUE///	
/*	public int compareTo(Ville autre) 
	{
		int result = this.nom.compareTo(autre.getNom());
		return result;
	}
*/
	///TRI PAR NBR HABITANT///
	public int compareTo(Ville autre) 
	{
		if (this.nbhabitant > autre.getNbhabitant())
		{
			return 1;
		}
		if (this.nbhabitant < autre.getNbhabitant())
		{
			return -1;
		}
		return 0;
		
	}
}

