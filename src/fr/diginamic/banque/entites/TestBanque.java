package fr.diginamic.banque.entites;

import fr.diginamic.banque.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte[] tabComptes = new Compte[2];
		tabComptes[0] = new Compte(15446, 60);
		tabComptes[1] = new CompteTaux(5616165, 56, 5);
		
		for(int i=0; i<=tabComptes.length; i++)
		{
			System.out.println(tabComptes[i]);	
		}
		

	}

}
