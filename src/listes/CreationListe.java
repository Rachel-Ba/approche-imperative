package listes;
import java.util.ArrayList;
//import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		for ( int i=0; i<=100; i++) 
		{
			list.add(i);			
		}
		
		System.out.println(list.size());


	}

}
