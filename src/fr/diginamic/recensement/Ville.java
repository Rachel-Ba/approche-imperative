package fr.diginamic.recensement;

import java.util.Comparator;

public class Ville
{
	
	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	// CONSTRUCTOR //
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) 
	{
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() 
	{
		return "Region : " + nomRegion + ", Code Region : " + codeRegion + ", Departement : " + codeDepartement
				+ ", Commune : " + nomCommune + ", Code Commune : " + codeCommune + ", Population : "
				+ populationTotale + "";
	}

	public String getCodeRegion() 
	{
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) 
	{
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() 
	{
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) 
	{
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() 
	{
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) 
	{
		this.codeDepartement = codeDepartement;
	}

	public String getCodeCommune() 
	{
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) 
	{
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() 
	{
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) 
	{
		this.nomCommune = nomCommune;
	}

	public int getPopulationTotale() 
	{
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) 
	{
		this.populationTotale = populationTotale;
	}
	
	public int compareTo(Ville v1) 
	{
		if (this.populationTotale > v1.getPopulationTotale())
		{
			return 1;
		}
		if (this.populationTotale < v1.getPopulationTotale())
		{
			return -1;
		}
		return 0;
		
	}

}


	
	
	
	
	
	

	
	
