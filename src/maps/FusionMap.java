package maps;

import java.util.*;

public class FusionMap {
public static void main(String args[]) {
	// Création map1
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	map1.put(1, "Rouge");
	map1.put(2, "Vert");
	map1.put(3, "Orange");
	// Création map2
	HashMap<Integer, String> map2 = new HashMap<Integer, String>();
	map2.put(4, "Blanc");
	map2.put(5, "Bleu");
	map2.put(6, "Orange");
//TODO Développements à réaliser ci-dessous
	
	HashMap<Integer, String> map3 = new HashMap<Integer, String>();
	map3.putAll(map1);
	map3.putAll(map2);
	
	Iterator<Integer> itMap3 = map3.keySet().iterator();
	
	while (itMap3.hasNext())
    {
        System.out.print(itMap3.next() + " ");
    }
    
    Iterator<String> itValMap3 = map3.values().iterator();
    
    
    while (itValMap3.hasNext())
    {
        System.out.print(itValMap3.next() + " ");
    }
    
    System.out.println(map3.size());
	}
}