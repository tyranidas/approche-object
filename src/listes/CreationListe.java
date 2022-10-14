package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList <Integer> liste1 = new ArrayList <Integer>();
		for (int i = 1; i <=100; i++)
		{
			liste1.add(i);
		}
		System.out.println(liste1.size());
	}
}
