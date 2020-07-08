package sets;
import java.util.Collections;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		//Instanciez un HashSet de doubles et placez y USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		//Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		int nbLettres = 0;
		String paysLePlusLong = null;
		for(String i:set)
		{
			if (i.length() > nbLettres)
			{
				nbLettres = i.length();
				paysLePlusLong = i;
			}
		}
		
		System.out.println(paysLePlusLong);
		
		//Supprimez ce pays
		set.remove(paysLePlusLong);
		System.out.println(set);
		

	}

}
