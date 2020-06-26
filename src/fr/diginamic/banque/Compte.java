package fr.diginamic.banque;

public class Compte {
	
	private int NumeroCompte;
	
	private int SoldeCompte;
	
	/////////////////////////////////

	public int getNumeroCompte() {
		return NumeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		NumeroCompte = numeroCompte;
	}

	public int getSoldeCompte() {
		return SoldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		SoldeCompte = soldeCompte;
	}

	
	//////////////////////////////////
	
	
	public Compte(int numeroCompte, int soldeCompte) {
		super();
		NumeroCompte = numeroCompte;
		SoldeCompte = soldeCompte;
	}
	
	
	public String toString() {
		return NumeroCompte + " " + SoldeCompte;
	}
	

	
	
	

}
