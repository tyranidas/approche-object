package listes;

import java.util.ArrayList;
import java.util.Collections;
import listes.ComparatorHabitant;
import listes.ComparatorNom;

public class Ville implements Comparable<Ville>
{
	
	private String name;
	private int pop;
	
	public Ville(String name, int pop) {
		this.name = name;
		this.pop = pop;
	}
	
	public String toString()
	{
		return "La ville "+this.name+" contient "+this.pop+" habitants";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public static void main(String[] args) {
		
		ArrayList<Ville> liste1 = new ArrayList <Ville>();
		Ville Nice = new Ville ("Nice", 343000);
		Ville Carcassonne = new Ville ("Carcassonne", 47800);
		Ville Narbonne = new Ville ("Narbonne", 53400);
		Ville Lyon = new Ville ("Lyon", 484000);
		Ville Foix = new Ville ("Foix", 9700);
		Ville Pau = new Ville ("Pau", 77200);
		Ville Marseille = new Ville ("Marseille", 850700);
		Ville Tarbes = new Ville ("Tarbes", 40600);
		
		Ville[] tab1 = {Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes};
		
		for (int i = 0; i < tab1.length; i++)
		{
			liste1.add(tab1[i]);
			System.out.println(liste1.get(i));
		}
		
		int maxPop = 0;
		String maxCity = null;
		for (int i = 0; i < liste1.size(); i++)
		{
				if (liste1.get(i).pop > maxPop)
				{
					maxPop = liste1.get(i).pop;
					maxCity =  liste1.get(i).name;
				}
					
		}
		System.out.println("La ville la plus grande est : "+maxCity);
		
		int minPop = maxPop;
		String minCity = null;
		for (int i = 0; i < liste1.size(); i++)
		{
				if (liste1.get(i).pop < minPop)
				{
					minPop = liste1.get(i).pop;
					minCity =  liste1.get(i).name;
				}
						
		}
		
		for (int i = 0; i < liste1.size(); i++)
		{
			if (liste1.get(i).name.equals(minCity))
			{
				System.out.println("La ville la plus petit a été supprimé c'était : "+minCity);
				liste1.remove(i);
				
			}
		}
		
		for (int i = 0; i < liste1.size(); i++)
		{
			
			if (liste1.get(i).pop >= 100000)
			{
		
			 liste1.get(i).setName(liste1.get(i).name.toUpperCase());
				
			}
		}
		
		
		Collections.sort(liste1, new ComparatorHabitant());
		
		for (int i = 0; i < tab1.length; i++)
		{
			liste1.add(tab1[i]);
			System.out.println(liste1.get(i));
		}
		
	Collections.sort(liste1, new ComparatorNom());
		
		for (int i = 0; i < tab1.length; i++)
		{
			liste1.add(tab1[i]);
			System.out.println(liste1.get(i));
		}
		
		
		
	
		
	}

	@Override
	public int compareTo(Ville autre) {
		/* int result = this.pop.compareTo(autre.getPop());
		return result;
		*/
		if  (this.pop > autre.getPop())
		{
			return 1;
		}
		else if  (this.pop < autre.getPop())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
		
}
