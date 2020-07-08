package sets;
import sets.Pays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetObjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pays> set = new HashSet<>();
		//Instanciez un HashSet de doubles et placez y USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		Pays p1 = new Pays("Usa", 328.2, 62794.59);
		set.add(p1);
		Pays p2 = new Pays("France", 66.99, 41463.64);
		set.add(p2);
		Pays p3 = new Pays("Allemagne", 83.02, 47603.03);
		set.add(p3);
		Pays p4 = new Pays("Italie", 60.36, 34483.20);
		set.add(p4);
		Pays p5 = new Pays("Japon", 126.5, 39289.96);
		set.add(p5);
		Pays p6 = new Pays("Chine", 1393.0, 9770.85);
		set.add(p6);
		Pays p7 = new Pays("Russie", 144.5, 11288.87);
		set.add(p7);
		Pays p8 = new Pays("Inde", 1353.0, 2009.98);
		set.add(p8);
		Pays p9 = new Pays("Uk", 66.65, 42943.90);
		set.add(p9);
			
		
		//Recherchez le pays avec le PIB/habitant le plus important
		double pib = 0;
		Pays paysPib = null;		
		
		for(Pays i:set)
		{
			if (i.getPibHabitants() > pib)
			{
				pib = i.getPibHabitants();
				paysPib = i;
			}
		}
		System.out.println("PIB/habitant le plus important : " + paysPib);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//Recherchez le pays avec le PIB total le plus important

		Pays Ref = set.iterator().next();
		for (Pays i : set)
		{
			if( i.getPibHabitants() * i.getNbHabitants() > Ref.getPibHabitants() * Ref.getNbHabitants())
			{
				Ref = i;
			}
		}
		System.out.println("PIB total le plus important" + Ref);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit 
		
		Pays Ref2 = set.iterator().next();
		for (Pays i : set)
		{
			if( i.getPibHabitants() * i.getNbHabitants() < Ref2.getPibHabitants() * Ref2.getNbHabitants())
			{
				Ref = i;
			}
		}
		System.out.println("PIB total le moins important : " + Ref2.getNom().toUpperCase());
		
		//Supprimez le pays dont le PIB total est le plus petit
		
		set.remove(Ref2);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
		
		for (Pays i : set)
		{
			System.out.println(i);
		}
		
	}

}
