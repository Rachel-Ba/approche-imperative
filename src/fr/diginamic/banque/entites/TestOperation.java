package fr.diginamic.banque.entites;
import fr.diginamic.banque.*;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double solde = 0.0;
		Operation tab[] = new Operation[4];
		tab[0] = new Credit ("26/06/2020", 200);
		tab[1] = new Debit ("26/06/2020", 25);
		tab[2] = new Credit ("26/06/2020", 50);
		tab[3] = new Debit ("26/06/2020", 35);
		
/*		for(int i=0; i<tab.length; i++)
		{
			System.out.println(tab[i]);
			
			if (tab[i].GetType().equals("CREDIT"))
			{
				solde += tab[i].getMontantOp();
			}
			else
			{
				solde -= tab[i].getMontantOp();
			}
			
		}*/
		
		

	}

}
