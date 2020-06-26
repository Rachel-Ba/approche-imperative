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
		
		//si void, pas de return, si String, return
		
		public void affichage()
		{
			System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase());
		}
		
		public String affichageString()
		{
			return nom.toUpperCase() + " " + prenom.toUpperCase();
		}
		
		////////////////////////////////////////////////////////////////////
		public void modifiNom(String modifnom)
		{
			this.nom = modifnom;
		}
		
		public void modifiPrenom(String modifPrenom)
		{
			this.prenom = modifPrenom;
		}

		public void modifiAdresse(AdressePostale modifAdresse)
		{
			this.adresse = modifAdresse;
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


