package sets;
import java.util.Collections;
import java.util.HashSet;
public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> set = new HashSet<>();
		//Instanciez un HashSet de doubles et placez y 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		//Affichez tous les éléments de la collection
		System.out.println(set);
		
		
		//Recherchez le plus grand élément de la collection
		System.out.println(Collections.max(set));
		
		// Supprimez le plus petit élément de la collection
		set.remove(Collections.min(set));
		System.out.println(set);

 
       

	}

}
