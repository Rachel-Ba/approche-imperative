package entites;

public class Cercle {
	
	////////// Attribut //////////////////
	
	private double rayon;
	
	////////// Constructeur //////////////	

	public Cercle(double rayon) 
	{
		super();
		this.rayon = rayon;
	}
	
	///////// Methode ////////////////////
	
	public double perimetre()
	{
		return rayon*2*Math.PI;
	}
	public double surface()
	{
		return rayon*rayon*Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}




	

}
