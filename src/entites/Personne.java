package entites;
import entites.AdressePostale;

public class Personne {

		public String nom;
		public String prenom;
		public AdressePostale adresse;
		
		public Personne(String Nom, String Prenom, AdressePostale Adresse)
		{
			this.nom = Nom;
			this.prenom = Prenom;
			this.adresse = Adresse;
	
		}
		
		//Dans la classe Personne, ajoutez une méthode qui permet d’afficher le nom et le
		//prénom avec le nom de famille en majuscules.
		
		public void affichage()
		{
			System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase());
		}
		
		public void modifiNom(String modifnom)
		{
			nom = modifnom;
		}
		
		public void modifiPrenom(String modifPrenom)
		{
			prenom = modifPrenom;
		}

		public void modifiAdresse(AdressePostale modifAdresse)
		{
			adresse = modifAdresse;
		}
		
		public String retourNom(String renom)
		{
			return renom;
		}
		
		public String retourPrenom(String rePrenom)
		{
			return rePrenom;
		}
		
		public AdressePostale retourAdresse(AdressePostale reAdresse)
		{
			return reAdresse;
		}

		

		
}


