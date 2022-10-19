package maps;

import java.util.*;


import listes.Ville;


public class MapVilles {
	public static void main(String args[]) {
	
	
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
		
	}
	HashMap<String, Ville> map3 = new HashMap<String, Ville>();
	
	for (int i = 0; i < tab1.length; i++)
	{
		map3.put(liste1.get(i).getName(), liste1.get(i));
	}
	
	
	
	
	
	Iterator<String> itVille = map3.keySet().iterator();
	
	int minPop = 1000000;
	String miniVille = null;
	
	while(itVille.hasNext())
	{
		String nomVille = itVille.next();
		Ville ville =map3.get(nomVille);
		if (ville.getPop() < minPop)
		{
			minPop = ville.getPop();
			miniVille = nomVille;
		}
	}
	
	
	
	map3.remove(miniVille);
	
	

	Iterator<Ville> itVilles = map3.values().iterator();
	while(itVilles.hasNext())
			{
				System.out.println(itVilles.next());
			}
	
	
	
		
		
		
		
	
	
	

	}
	
	
}
