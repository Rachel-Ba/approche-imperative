package essais;
import entites.CompteBancaire;
import entites.AdressePostale;
import entites.Personne;

public class TestCompteBancaire {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale ap = new AdressePostale(14,"saloperie",34000,"genaimarre");
		
		Personne pute = new Personne("Clafouti","Patate",ap);
		
		CompteBancaire cb1 = new CompteBancaire("cdgsh564",50, pute);
		
		System.out.println(cb1);
		
		String resultat = cb1.crediterMontant(5.5);
		String resultat2 = cb1.debiterMontant(20.0);
		
		System.out.println(resultat);
		System.out.println(resultat2);

		
		
		
		
		
		
		
	
	}

}
