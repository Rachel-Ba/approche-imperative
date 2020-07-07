package fr.diginamic.recensement;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import fr.diginamic.recensement.Ville;


public class Application {
	public static void main(String[] args) {
		try 
		{
			File file = new File("C:/Users/Dell/git/approche-imperative/src/fr/diginamic/fichier/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			int popHerault = 0;			
			String b = null;
			int c = 0;
			int d = 0;
			String e = null;
			ArrayList<Ville> hrlt = new ArrayList<Ville>();

			
			for (String i: lignes)
			{
				
				String[] morceaux = i.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];
				
				population = population.replace(" ", "");
				int populationTotale = Integer.parseInt(population);
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
				
				if(ville.getNomCommune().equals("Montpellier"))
				{
					Ville Montpellier = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
					System.out.println("Ville de Montpellier : " + Montpellier);
				}
				if(ville.getCodeDepartement().equals("34"))
				{
					Ville Herault = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
					popHerault = populationTotale+popHerault;	
					
										
						if (Herault.getPopulationTotale()>c)
						{
							c = Herault.getPopulationTotale();
							b = Herault.getNomCommune();
						}
						
						if (Herault.getPopulationTotale()<c)
						{
							d = Herault.getPopulationTotale();
							e = Herault.getNomCommune();
						}
					
					
					hrlt.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));
				}
				
				
			}
			Collections.sort(hrlt);
			
			System.out.println("Population de tout le département de l’Hérault = " + popHerault);
			System.out.println("Ville avec le plus grand nombre d'habitant : " + b);
			System.out.println("Ville avec le plus grand nombre d'habitant : " + e);
			
			//System.out.println("Nombre de lignes :" + lignes.size());
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}


		}


}
