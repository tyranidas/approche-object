package listes;

import java.util.Comparator;


public class ComparatorHabitant implements Comparator<Ville> {

	public int compare(Ville lui, Ville autre) {
		if  (lui.getPop() > autre.getPop())
		{
			return 1;
		}
		else if  (lui.getPop() < autre.getPop())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		}
	

}
