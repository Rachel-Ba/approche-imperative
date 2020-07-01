package fr.diginamic.formes;

public class Carre extends Rectangle{
	
	public Carre(double cote) {
		super(cote,cote);
	}
	
	public String toString() {
		return "Carré [perimetre()=" + calculerPerimetre() + ", surface()=" + calculerSurface() + "]";
	}
	
	

}
