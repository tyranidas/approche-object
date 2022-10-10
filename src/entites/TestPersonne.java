package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne bob = new Personne("Morane", "Bob", new AdressePostale(5, "rue de la Liberté", 44200, "Nantes"));
		
		Personne martine = new Personne("A la plage", "Martine", new AdressePostale(5, "rue de la Liberté", 44200, "Nantes"));
		
		String bigName = martine.majName(martine.nom);
		martine.setAdresse(15, "rue trucmuche", 44610, "Indre");
		System.out.println(bigName);
		System.out.println(bob.prénom);
		AdressePostale name = martine.getAdresse();
		System.out.println(martine.adresse.libelléDeRue);
	}

}
