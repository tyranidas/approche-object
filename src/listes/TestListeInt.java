package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList <Integer> liste1 = new ArrayList <Integer>() {{
		add(-1);
		add(5);
		add(7);
		add(3);
		add(-2);
		add(4);
		add(8);
		add(5);
		}};
		for (int i = 1; i <= liste1.size(); i++)
		{
			System.out.println("L élément en position "+i+" est "+liste1.get(i-1)); 
			
		}
	System.out.println("La liste contient "+liste1.size()+" éléments");
		int maxValue = 0;
		for (int i = 0; i < liste1.size(); i++)
		{
			if (liste1.get(i)> maxValue)
			{
				maxValue = liste1.get(i);
			}
		}
		
		System.out.println("Le maximum de la liste est "+maxValue);
		
		int minValue = 1000000000;
		for (int i = 0; i < liste1.size(); i++)
		{
			if (liste1.get(i)< minValue)
			{
				minValue = liste1.get(i);
			}
			
			
		
			
		}
		for (int i = 1; i < liste1.size(); i++)
		{
			if (liste1.get(i) == minValue)
			{
				System.out.println("L élément en position "+i+" qui est "+liste1.get(i)+" a été supprimé"); 
				liste1.remove(i);
			}
		}
		for (int i = 1 ; i <= liste1.size(); i++)
		{
			System.out.println("L élément en position "+i+" est "+liste1.get(i-1)); 
		}
		
		for (int i = 1 ; i <= liste1.size(); i++)
		{
			if (liste1.get(i-1) < 0)
			{
				liste1.set(i-1,liste1.get(i-1)*(-1) );
			}
			System.out.println("L élément en position "+i+" est "+liste1.get(i-1)); 
		}
		
	}

}
