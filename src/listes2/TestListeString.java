package listes2;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> liste = new ArrayList<>();
		
		liste.add("Nice");
		liste.add("Carcassone"); //10
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille"); // 9
		liste.add("Tarbes");
		
		String b = null;
		int c = 0;
		
		
		for ( int i=0; i<liste.size(); i++) 
		{
			
			if (liste.get(i).length() > c)
			{
				c = liste.get(i).length();
				b = liste.get(i);
				
			}
			
		}		
		System.out.println("Ville avec le plus de lettre : " + b);
		
		///////////////////////////////////////////////////////////////////
		
		for ( int i=0; i<liste.size(); i++) 
		{
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println("Liste Ville Majuscule : " + liste);
		
		///////////////////////////////////////////////////////////////////
		for ( int i=0; i<liste.size(); i++) 
		{
			if(liste.get(i).startsWith("N"))
			{
				liste.remove(liste.get(i));
			}
		}
		System.out.println("Liste sans N Ville : " + liste);
		
	}

}
