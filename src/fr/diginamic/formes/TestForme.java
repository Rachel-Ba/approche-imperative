package fr.diginamic.formes;
import fr.diginamic.formes.*;

public class TestForme {
	

	public static void main(String[] args) {
	
		Cercle ce1 = new Cercle(3.0);
		Carre ca1 = new Carre(3.0);
		Rectangle r1 = new Rectangle(3.0,4.0);
		
		AffichageForme.afficher(ce1);
		AffichageForme.afficher(ca1);
		AffichageForme.afficher(r1);
		
	}

}
