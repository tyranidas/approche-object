package testnumerotation;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Saison[] saisons = Saison.values();
		
		for (Saison s: saisons)
		{
			System.out.println(s.getLibellé());
		}
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom).getLibellé());
		
		String libelle = "Hiver";
		
		System.out.println(Saison.ofLibelle(libelle));
		
	}

}
