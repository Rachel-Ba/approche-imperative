package anonyme;

import java.util.List;

public class testClasseAnonyme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation op = (a, b) -> a + b;
		System.out.println(op.exec(8.0, 5.0));
		
		Predicat p = d -> d > -10.0;
		
		List<Double> maListe = List.of(10.0, -28.0, 12.0, -2.5);
		for (Double i : maListe)
		{
			if (p.test(i))
			{
				System.out.println(p);
			}
		}

	}

}
