package essais;
import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4.3;
		
		Cercle c1 = new Cercle(x);
		Cercle c2 = new Cercle(6.6);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Cercle resultat = CercleFactory.niqueToi(5.0);
		
		System.out.println(resultat);
		

	}

}
