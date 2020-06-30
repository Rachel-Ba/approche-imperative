package fr.diginamic.chaines;
import java.util.Arrays;
import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chaine = "Durand;Marcel;2 523.5";
		
/*		char cara1 = chaine.charAt(0);
		int long1 = chaine.length();
		
		char c = ';';
		int index1 = chaine.indexOf(c);
		
		String chaine2 = chaine.substring(0, chaine.indexOf(c));
		
		String maj = chaine2.toUpperCase();
		
		String min = chaine2.toLowerCase();
		
		String[] tab = chaine.split(";"); 
		
		System.out.println("Premier caractere: " + cara1);
		System.out.println("Longueur : " + long1);
		System.out.println("Index ; : " + index1);
		System.out.println("Substring : " + chaine2);
		System.out.println("Majuscule : " + maj);
		System.out.println("Minuscule : " + min);
		System.out.println("Split : " + Arrays.toString(tab));
		
		System.out.println(" ");*/
		
//		System.out.println("Chaine principale : " + chaine);
		
		String test = chaine.replaceAll(" ", "");
//		System.out.println("Chaine sans espace : " + test);
		
		char c = ';';
		String chaine2 = test.substring(test.lastIndexOf(c)+1, test.length());
//		System.out.println("Salaire : " + chaine2);
		
		double val = Double.parseDouble(chaine2);
//		System.out.println("Salaire double : " + val);
		
		String[] tab = test.split(";"); 
//		System.out.println("Tableau test : " + Arrays.toString(tab));
		
		Salarie salariee = new Salarie(tab[0],tab[1],val);
		System.out.println("Resultat final : " + salariee);
		

	}

}
