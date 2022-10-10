package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne bob = new Personne("Morane", "Bob", new AdressePostale(5, "rue de la Liberté", 44200, "Nantes"));
		
		Personne martine = new Personne("A la plage", "Martine", new AdressePostale(5, "rue de la Liberté", 44200, "Nantes"));
		martine.nom = "A la plage";
		martine.prénom ="Martine";
		martine.adresse = null;
	}

}
