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
}


