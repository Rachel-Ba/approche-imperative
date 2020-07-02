package listes2;
import java.util.ArrayList;

import listes2.Ville;

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
		
		for( Ville v : list)
			System.out.println(v.getNom() + " " + v.getNbhabitant());
		
		System.out.println(" ");		
		System.out.println(" ");
		
		String b = null;
		int c = 0;
		
		
		
		for ( Ville v : list) 
		{
			if (v.getNbhabitant()>c)
			{
				c = v.getNbhabitant();
				b = v.getNom();
			}
			
		}
		System.out.println("Ville avec le plus grand nombre d'habitant : " + b);
		
		System.out.println(" ");		
		System.out.println(" ");
		
		int d = c;
		String e = null;
		
		for ( Ville v : list) 
		{
			if (v.getNbhabitant()<d)
			{
				d = v.getNbhabitant();
				e = v.getNom();
			}
			
		}
		
		System.out.println("Ville avec le plus petit nombre d'habitant : " + e);
		

			
		
		

	}

}
