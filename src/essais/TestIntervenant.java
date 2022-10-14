package essais;

import salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie a = new Salarie("Martin", "Margot", 1500);
		System.out.println(a.getSalaire());
		
		System.out.println(a.afficherDonnees());
		
		
		Pigiste z = new Pigiste("Morane", "Bob", 20, 50);
		System.out.println(z.getSalaire());
		
		System.out.println(z.afficherDonnees());
		

	}

}
