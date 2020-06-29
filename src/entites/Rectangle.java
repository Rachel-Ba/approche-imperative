package entites;

public class Rectangle {
	
	////// Attribut /////////////////////////
	private double longueur;
	private double largeur;
	
	///////  Constructeur ///////////////////
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	////// Methode //////////////////////////
	
	public double perimetre()
	{
		return (longueur+largeur)*2;
	}
	public double surface()
	{
		return longueur*largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetre()=" + perimetre() + 
				", surface()=" + surface() + "]";
	}
	
	
	
	

}
