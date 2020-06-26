package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new AdressePostale(5,"place Agatha Christie",26000,"Valence");
		
		AdressePostale ap2 = new AdressePostale(457, "rue Auguste Broussonnet",34090,"Montpellier");
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		Personne p1 = new Personne("Subedar","Naib",ap1);
		
		Personne p2 = new Personne("Clark","Eli",ap2);

		/////////////////////////////////////////////////////////////////////
		String a = p1.affichageString();
		
		p2.affichage();		
		
		////////////////////////////////////////////
		
		p1.modifiNom("canard");
		p1.modifiPrenom("coincoin");
		System.out.println(p1.nom);
		
		String nomTest = p1.retourNom("patate");
		System.out.print(nomTest);
		
		//////////////////////////////////////////////////
		
	}

}
