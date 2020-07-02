package Interface_TP05;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ObjetGeometrique tab[] = new ObjetGeometrique[2];
		
		Cercle c1 = new Cercle(3.2);
		Rectangle r1 = new Rectangle(4.5,3.6);
		
		tab[0] = c1;
		tab[1] = r1;
		
		/* tab[0] = new Cercle(3.2);
		 * tab[1] = new Rectangle(4.5,3.6);
		 */
		
		for (int i = 0; i < tab.length; i++) 
		{
			System.out.println(tab[i]);
		}
		

		
		


	}

	

}
