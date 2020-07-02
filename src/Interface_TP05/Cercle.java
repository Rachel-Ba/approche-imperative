package Interface_TP05;

public class Cercle implements ObjetGeometrique {
	
	////////// Attribut //////////////////
	
	private double rayon;	
	
	///////// Implementation Méthode /////

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return rayon*2*Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return rayon*rayon*Math.PI;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////	

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}

	
	
	
	

}
