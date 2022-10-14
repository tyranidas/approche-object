package chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";
		//1
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: "+premierCaractere);
		//2
		int longueurChaine = chaine.length();
		System.out.println("Longueur de la chaîne de caractère : "+longueurChaine);
		//3
		int indexCaractere = chaine.indexOf(';');
		System.out.println("Le premier \';\' est en "+indexCaractere+"ème position.");
		//4
		String nomFamille = chaine.substring(0, indexCaractere);
		System.out.println("Le nom de famille est : "+nomFamille);		
		//5
		System.out.println("Le nom de famille est : "+nomFamille.toUpperCase());
		//6
		System.out.println("Le nom de famille est : "+nomFamille.toLowerCase());
		//7
		String[] tabChaine = chaine.split(";");
		for (int i = 0; i < tabChaine.length ; i++)
		{
			System.out.println(tabChaine[i]);
		}
		//9
		
		Salarie uno = new Salarie(tabChaine[0], tabChaine[1], Double.parseDouble(tabChaine[2].replace(" ", "")));
		System.out.println(uno);
		
		
		
	}

}
