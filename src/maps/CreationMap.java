package maps;

import java.util.*;

public class CreationMap {

	public static void main(String[] args) {
		
	
		
		HashMap<String, Double> mapSalaire = new HashMap<String, Double>();

		
		mapSalaire.put("Paul", (double) 1750);
		mapSalaire.put("Hicham", (double) 1825);
		mapSalaire.put("Yu", (double) 2250);
		mapSalaire.put("Ingrid", (double) 2015);
		mapSalaire.put("Chantal", (double) 2418);
		
		System.out.println(mapSalaire.size());
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> itMapVille = mapVilles.keySet().iterator();
	       
        while (itMapVille.hasNext())
        {
            System.out.print(itMapVille.next() + " ");
        }
        
        Iterator<String> valueMapVille = mapVilles.values().iterator();
        
        
        while (valueMapVille.hasNext())
        {
            System.out.print(valueMapVille.next() + " ");
        }
        
        System.out.println(mapVilles.size());
	
		
		
	}

}
