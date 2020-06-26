package fr.diginamic.banque;

public class CompteTaux extends Compte{
	
	////////// Attribut ////////////////
	
	private int NumCompte;
	
	private int SoldeCompte;
	
	private int TauxRemuneration;
	
	///////// Getter Setter //////////////

	public int getNumCompte() {
		return NumCompte;
	}

	public void setNumCompte(int numCompte) {
		NumCompte = numCompte;
	}

	public int getSoldeCompte() {
		return SoldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		SoldeCompte = soldeCompte;
	}

	public int getTauxRemuneration() {
		return TauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		TauxRemuneration = tauxRemuneration;
	}

	
	///////////// Constructeur //////////////////
	
	public CompteTaux(int numCompte, int soldeCompte, int tauxRemuneration)
	{
		super(numCompte, soldeCompte);
		this.TauxRemuneration = tauxRemuneration;
	}
	
	public String toString() {
		return super.toString() + " " + TauxRemuneration;
	}


	
	
	
	
	
	

}
