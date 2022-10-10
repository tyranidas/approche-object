package entites;



public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale();
		a.numeroDeRue = 5;
		a.libelléDeRue = "rue de la Liberté";
		a.codePostal = 44200;
		a.ville = "Nantes";
		
		AdressePostale n = new AdressePostale();
		n.numeroDeRue = 15;
		n.libelléDeRue = "rue de la Paix";
		n.codePostal = 44610;
		n.ville = "Indre";
	}

}
