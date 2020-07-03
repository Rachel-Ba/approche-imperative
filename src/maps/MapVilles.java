package maps;
import java.util.ArrayList;
import java.util.HashMap;
import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> list = new ArrayList<>();
		
		list.add(new Ville("Nice", 343000));
		list.add(new Ville("Carcassonne", 47800));
		list.add(new Ville("Narbonne", 53400));
		list.add(new Ville("Lyon", 484000));
		list.add(new Ville("Foix", 9700));
		list.add(new Ville("Pau", 77200));
		list.add(new Ville("Marseille", 850700));
		list.add(new Ville("Tharbes", 40600));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
//créez une map permettant de stocker les instances de villes (valeur)
		//en fonction de leur nom (clé).
		for(Ville ville : list)
		{
			map.put(ville.getNom(), ville.getNbhabitant());
		}
		
		map.forEach((key, value) -> System.out.println(key + ":" + value));
		
		System.out.println(" ");
		System.out.println(" ");

//Recherchez et supprimez la ville qui a le moins d’habitants
		
		int i = map.values().stream().min(Integer::compare).get();

		map.values().remove(i);
		map.forEach((key, value) -> System.out.println(key + ":" + value));
	}

}
