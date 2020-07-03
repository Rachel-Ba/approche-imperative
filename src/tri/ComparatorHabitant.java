package tri;
import java.util.Comparator;
import tri.Ville;

public class ComparatorHabitant implements Comparator<Ville>{
	
	
	
	public int compare(Ville ch1, Ville ch2) 
	{
		if (ch1.nbhabitant > ch2.getNbhabitant())
		{
			return 1;
		}
		if (ch1.nbhabitant < ch2.getNbhabitant())
		{
			return -1;
		}
		return 0;
	}
	

}
