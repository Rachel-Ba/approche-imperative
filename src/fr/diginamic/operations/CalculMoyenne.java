package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double tab[];

	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}
	
/*	public String ajoutDouble(double ajout)
	{
		return(0); 
	}
*/	
	public double calcul()
	{
		double stockage = 0;
		for (int i = 0; i < tab.length; i++) 
		{
			stockage = stockage + tab[i];
		}
		stockage = stockage/tab.length;
		return stockage; 
	}

	@Override
	public String toString() {
		return "La moyenne est de " + calcul();
	}
	
	


	
	

}
