package tri;
import java.util.Collections;
import java.util.ArrayList;
import tri.Ville;
import tri.ComparatorHabitant;

public class TestVille {

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
		
/*		for( Ville v : list)
			System.out.println(v.getNom() + " " + v.getNbhabitant());*/
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Collections.sort(list);
/*		for( Ville v : list)
			System.out.println(v.getNom() + " " + v.getNbhabitant());*/
		
		ComparatorHabitant ch = new ComparatorHabitant();
		Collections.sort(list, ch);
		
		for( Ville v : list)
			System.out.println(v.getNom() + " " + v.getNbhabitant());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		ComparatorNom cn = new ComparatorNom();
		Collections.sort(list, cn);
		
		for( Ville v : list)
			System.out.println(v.getNom() + " " + v.getNbhabitant());
		
		list.forEach(System.out::println);

	}
	

}
