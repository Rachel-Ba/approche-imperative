package fr.diginamic.chaines;
import java.lang.StringBuilder;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  ajoutez tous les nombres de 1 à 100 000 dans une instance deStringBuilder.
		
		long debut = System.currentTimeMillis();
		StringBuilder str = new StringBuilder("");
				
        for( int i=0; i<=100_000; i++) 
        {
        	str.append(i+",");	
        }
        
      //  System.out.println(str);
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
        
        long debut2 = System.currentTimeMillis();
        String string = " ";
        for( int i=0; i<=100_000; i++) 
        {
        	string = string + i;	
        }
       // System.out.println(string);
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
        
        
     // Code à chronométrer
     

	}

}
