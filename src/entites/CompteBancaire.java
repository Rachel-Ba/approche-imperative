package entites;
import entites.Personne;

public class CompteBancaire {
	////// Attribut /////////////////////////
	
	private String numCompte;
	private double solde;
	private Personne proprio;
	
	///////  Constructeur ///////////////////
	
	public CompteBancaire(String numCompte, double solde, Personne proprio) 
	{
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.proprio = proprio;
		
	}
	
	//////Methode //////////////////////////
	public String crediterMontant(double montant)
	{
		return "Solde actuel :" + (solde + montant); 
	}
	
	public String debiterMontant(double montant)
	{
		return "Solde actuel :" + (solde - montant); 
	}

	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", solde=" + solde + "\n\r" + "proprio=" + proprio  + "]";
	}
	
	
	

}
