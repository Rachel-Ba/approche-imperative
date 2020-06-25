package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new AdressePostale(5,"place Agatha Christie",26000,"Valence");
/*		ap1.numeroRue = 5;
		ap1.libelleRue = "place Agatha Christie";
		ap1.codePostal = 26000;
		ap1.ville = "Valence";*/
		
		AdressePostale ap2 = new AdressePostale(457, "rue Auguste Broussonnet",34090,"Montpellier");
/*		ap2.numeroRue = 457;
		ap2.libelleRue = "rue Auguste Broussonnet";
		ap2.codePostal = 34090;
		ap2.ville = "Montpellier";*/
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		Personne p1 = new Personne("Subedar","Naib",ap1);
/*		p1.nom = "Subedar";
		p1.prenom = "Naib";
		p1.adresse = ap1;*/
		
		Personne p2 = new Personne("Clark","Eli",ap2);
/*		p2.nom = "Clark";
		p2.prenom = "Eli";
		p2.adresse = ap2;*/
	}

}
