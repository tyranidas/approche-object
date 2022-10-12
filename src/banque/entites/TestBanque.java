package banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte norm = new Compte(4564231, 25000);
		ClassTaux taux = new ClassTaux (942, 120000, 1.2);
		
		Compte[] tab1 = {norm, taux};
		
		for ( int i = 0; i < tab1.length; i++)
		{
			System.out.println(tab1[i]);
		}
				
	}

}
