package entites;

public class Cercle {
	
	/////// Attribut d'instance //////
	
	private double rayon;
	
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;

	}
	
	////// Constructeur //////////////

	public Cercle(double rayon) 
	{
		super();
		this.rayon = rayon;
	}


	////// Methode ///////////////////
		
	@Override
	public String toString() {
		return "Cercle [Perimetre=" + this.rayon*2 + ", Surface = " + (this.rayon*Math.PI*this.rayon) + "]";
	
	}

}
