package entites;
import entites.AdressePostale;

public class Personne {

		public String nom;
		public String prenom;
		public AdressePostale adresse;
		
		public Personne(String consNom, String consPrenom, AdressePostale consAdresse)
		{
			nom = consNom;
			prenom = consPrenom;
			adresse = consAdresse;
		}
}


