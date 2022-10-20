package listes;

public class Ville implements Comparable<Ville>
{
	
	private String name;
	private int pop;
	private Continent continent;
	
	

	public Ville(String name, int pop, String continent) {
		this.name = name;
		this.pop = pop;
		this.continent = Continent.ofLibelle(continent);
	}
	
	public String toString()
	{
		return "La ville "+this.name+" contient "+this.pop+" habitants et se trouve sur le continent "+this.continent.getLibellé();
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
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	

	/*
	 * public static void main(String[] args) {
		
		ArrayList<Ville> liste1 = new ArrayList <Ville>();
		Ville nice = new Ville ("Nice", 343000);
		Ville nice2 = new Ville ("Nice", 343000);
		Ville carcassonne = new Ville ("Carcassonne", 47800);
		Ville narbonne = new Ville ("Narbonne", 53400);
		Ville lyon = new Ville ("Lyon", 484000);
		Ville foix = new Ville ("Foix", 9700);
		Ville pau = new Ville ("Pau", 77200);
		Ville marseille = new Ville ("Marseille", 850700);
		Ville tarbes = new Ville ("Tarbes", 40600);
		
		Ville[] tab1 = {nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes};
		
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
		
		System.out.println(nice.equals(nice2));;
		
		
	
		
	}*/
	@Override
	public boolean equals(Object object)
	{
		if (!(object instanceof Ville))
			{
				return false;
			}
		
		Ville autre = (Ville) object;
			//(pop == autre.getPop()) &&
		if ( (this.pop == autre.getPop()) && autre.getName().equals(this.getName()))
		{
			return true;
		}
		
			return false;
		
			
		
			
			
			
		
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
