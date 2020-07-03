package maps;
import java.util.HashMap;
import java.util.TreeMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		for(Integer key : mapVilles.keySet())
		{
			System.out.println(key);
		}
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		System.out.println(mapVilles.values());
		
		//Afficher la taille de la map
		System.out.print(mapVilles.size());

	}

}
