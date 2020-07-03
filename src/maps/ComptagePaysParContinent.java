package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pays> list = new ArrayList<>();
		
		list.add(new Pays("France", 65.0,"Europe"));
		list.add(new Pays("Allemagne", 80.0,"Europe"));
		list.add(new Pays("Belgique", 10.0,"Europe"));
		list.add(new Pays("Russie", 150.0,"Asie"));
		list.add(new Pays("Chine", 1.4,"Asie"));
		list.add(new Pays("Indonésie", 220.0,"Oceanie"));
		list.add(new Pays("Australie", 20.0,"Oceanie"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (Pays p : list) {
			Integer cmpt = map.get(p.getContinent());

			if (cmpt==null) {
				map.put(p.getContinent(), 1);
			}
			else 
			{
				cmpt++;
				map.put(p.getContinent(), cmpt);
			}
		}
		
		map.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
