package listes;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
	

		public int compare(Ville lui, Ville autre) {
			int result = lui.getName().compareTo(autre.getName());
			return result;
		

	}

}
