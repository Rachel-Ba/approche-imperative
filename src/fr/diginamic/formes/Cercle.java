package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double calculerPerimetre()
	{
		return rayon*2*Math.PI;
	}
	public double calculerSurface()
	{
		return rayon*rayon*Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle [Perimetre()=" + calculerPerimetre() + ", Surface()=" + calculerSurface() + "]";
	}
	
	

	
	

}
