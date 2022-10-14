package essais;

import maison.Maison;
import maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalleDeBain sdb = new SalleDeBain(12, 1);
		Salon salon = new Salon(60,0);
		Cuisine cuisine = new Cuisine(20,0);
		Chambre chambre1 = new Chambre(14,1);
		Chambre chambre2 = new Chambre(12,1);
		Chambre chambre3 = new Chambre(18,1);
		Wc wc1 = new Wc(4,0);
		Wc wc2 = new Wc(2,1);
		Piece[] wait = {sdb, cuisine, chambre1, chambre2, salon, wc1,wc2};
		Maison chezwam = new Maison(wait) ;
		
		System.out.println(Maison.superficieTotale(chezwam));
		Maison.ajouterPiece(chezwam, chambre3);
	
	
		System.out.println(Maison.superficieTotale(chezwam));
		System.out.println(Maison.superficieEtage(chezwam, 0));
		
		
		Maison.ajouterPiece(chezwam, null);
		System.out.println(Maison.superficieTotale(chezwam));
		
		System.out.println(Maison.superficiePieces(chezwam, "Salon"));
		System.out.println(Maison.pieceNumber(chezwam, "Chambre"));
		
	}
}
