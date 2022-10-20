package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		Continent[] continents = Continent.values();
		
		for (Continent c: continents)
		{
			System.out.println(c.getLibellé());
		}
		
		
		ArrayList<Ville> liste1 = new ArrayList <Ville>();
		liste1.add(new Ville ("New York", 15_000_000,  "Amérique"));
		liste1.add(new Ville ("Paris", 10_000_000,  "Europe"));
		liste1.add(new Ville ("Pekin", 25_000_000,  "Asie"));
		liste1.add(new Ville ("Moscou", 10_000_000,  "Europe"));
		liste1.add(new Ville ("Berlin", 8_000_000,  "Europe"));
		liste1.add(new Ville ("Sydney", 4_000_000,  "Océanie"));
		liste1.add(new Ville ("Sao Paulo", 15_000_000,  "Amérique"));
		liste1.add(new Ville ("Dakar", 10_000_000,  "Afrique"));
		
		for (Ville l: liste1)
		{
			System.out.println(l);
		}
		
	}

}
