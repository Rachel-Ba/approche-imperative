package essais;
import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle r1 = new Cercle(12.0);
		Cercle r2 = new Cercle(3.4);
		
		System.out.println(r1);
		System.out.println(r2);
		
		CercleFactory r3 = new CercleFactory();
		
		System.out.println(r3);

	}

}
