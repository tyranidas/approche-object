package entites;



public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale(5, "rue de la Liberté", 44200, "Nantes");
		AdressePostale n = new AdressePostale(15, "rue de la Paix", 44610, "Indre");
		System.out.println(n.codePostal);
		System.out.println(a.codePostal);
	}

}
