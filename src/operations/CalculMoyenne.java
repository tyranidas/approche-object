package operations;

public class CalculMoyenne {
	
	double[] tab;
	
	public CalculMoyenne(double[] tab) {
		this.tab = tab;
	}

	
	public String toString()
	{
		return "Le tableau de longueur "+tab.length
		+" a une moyenne de "+calcul();
	
				
				
	}
	
	public static double[] agrandir(double[] tab)
	{
		double[] tabTemp = new double[tab.length+1];
		for (int i =0;i<tab.length;i++)
		{
			tabTemp[i] = tab[i];
		}
		//System.out.println(tabTemp.length);
		return tabTemp;
	}
	
	public static double[] ajout (double[] tab, double x)
	{
		double[] tabTemp = new double[tab.length+1];
		for (int i =0;i<tab.length;i++)
		{
			tabTemp[i] = tab[i];
		}
		tabTemp[tabTemp.length-1] = x;
	
		return tabTemp;
	}
	
	public double calcul()
	{
		double somme =0;
		for (int i =0; i < tab.length; i++)
		{
			somme += tab[i];
		}
		return somme/(tab.length);
	}
}
