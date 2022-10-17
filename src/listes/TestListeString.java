package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList <String>();
		String[] tab1 = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
		
		for (int i = 0; i < tab1.length; i++)
		{
			liste1.add(tab1[i]);
			//System.out.println(liste1.get(i));
		}
		int maxChar = 0;
		String maxCity = null;
		for (int i = 0; i < liste1.size(); i++)
		{
				if (liste1.get(i).length() > maxChar)
				{
					maxChar = liste1.get(i).length();
					maxCity =  liste1.get(i);
				}
					
		}
		System.out.println("La ville la plus grande est : "+maxCity);
		
		for (int i = 0; i < liste1.size(); i++)
		{
			liste1.set(i, liste1.get(i).toUpperCase());
			System.out.println(liste1.get(i));
		}
		
		for (int i = 0; i < liste1.size(); i++)
		{
			if (liste1.get(i).charAt(0)== 'N')
			{
				liste1.remove(i);
			}
			System.out.println(liste1.get(i));
		}
		
		
		
		
	}

}
