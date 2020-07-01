package fr.diginamic.formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double calculerPerimetre()
	{
		return (longueur+largeur)*2;
	}
	public double calculerSurface()
	{
		return longueur*largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetre()=" + calculerPerimetre() + ", surface()=" + calculerSurface() + "]";
	}
	
	


}
