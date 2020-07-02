package Interface_TP05;

public class Rectangle implements ObjetGeometrique{
	////// Attribut /////////////////////////
	private double longueur;
	private double largeur;
	
	///////// Implementation Méthode /////	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (longueur+largeur)*2;
	}
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}
	
//////////////////////////////////////////////////////////////////////
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	@Override
	public String toString() {
		return "Rectangle [perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
	
	
	
	
	
	

}
