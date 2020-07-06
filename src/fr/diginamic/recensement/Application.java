package fr.diginamic.recensement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import fr.diginamic.recensement.Ville;

public class Application {
	public static void main(String[] args) {
		try 
		{
			File file = new File("C:/Users/Dell/git/approche-imperative/src/fr/diginamic/fichier/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			List<String> res = new ArrayList<>();
			
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
				
				/*if(i.contains("Montpellier"))
				{
					res.add(i);
				}*/
				System.out.println(ville);
			}
			
			
			//System.out.println("Nombre de lignes :" + lignes.size());
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}


		}


}
