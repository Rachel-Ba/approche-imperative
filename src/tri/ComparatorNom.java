package tri;
import java.util.Comparator;
import tri.Ville;

public class ComparatorNom implements Comparator<Ville>{
	
	public int compare(Ville ch1, Ville ch2) 
	{
		int result = ch1.getNom().compareTo(ch2.getNom());
		return result;
	}

}
