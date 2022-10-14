package essais;

import formes.Carre;
import formes.Cercle;
import formes.Rectangle;


public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c = new Cercle(2);
		AffichageForme.afficher(c);
		
		
		Rectangle r = new Rectangle(2,4);
		AffichageForme.afficher(r);
		
		Carre ca = new Carre (5);
		AffichageForme.afficher(ca);
	}
}
