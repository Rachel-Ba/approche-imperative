package listes2;

import java.util.ArrayList;
import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println("Ma liste : " + liste);
		System.out.println("Taille liste : " + liste.size());
		System.out.println();
		
		System.out.println("Nombre entier max : " + Collections.max(liste));
		System.out.println();
		
		liste.remove(Collections.min(liste));
		System.out.println("Liste sans le plus petit nombre : " + liste);
		
		for ( int i=0; i<liste.size(); i++) 
		{
			if (liste.get(i)<0)
			{
				liste.set(i, liste.get(i)*-1);
			}
		}
		
		System.out.println("Liste uniquement positive : " + liste);
		

	}

}
