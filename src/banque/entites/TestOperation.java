package banque.entites;

public class TestOperation {
	public static void main(String[] args) 
	{
	Operation[] tab1 = new Operation[4];
	tab1[0] = new Credit("hier", 500);
	tab1[1] = new Credit("il y a 2 jours", 1500);
	tab1[2] = new Debit("aujourd'hui", 125);
	tab1[3] = new Debit("il y a 2 jours", 534);
	
	double solde = 0;
	for (int i = 0; i < tab1.length ; i++)
		{
		System.out.println(tab1[i].getType());
		System.out.println(tab1[i].date);
		System.out.println(tab1[i].montant);
		
		
		
		if (tab1[i].getType()== "CREDIT")
			{
			solde +=  tab1[i].montant;
			}
		if (tab1[i].getType()== "DEBIT")
			{
			solde -=  tab1[i].montant;
			}
		
		}
	System.out.println("Il vous reste "+solde+"€");
	}
}
