package fr.diginamic.formes;

public class Carre extends Rectangle{
	
	public Carre(double cote) {
		super(cote,cote);
	}
	
	public String toString() {
		return "Carr� [perimetre()=" + calculerPerimetre() + ", surface()=" + calculerSurface() + "]";
	}
	
	

}
