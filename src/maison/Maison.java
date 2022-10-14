package maison;

public class Maison {

	public Piece[] pieces;
	
	
	
	public Maison(Piece[] pieces) {
		
		this.pieces = pieces;
	}



	public static Piece[] ajouterPiece (Maison maison, Piece piece)
	{
		if (piece != null)
		{
			Piece[] pieceTemp = new Piece[maison.pieces.length+1];
			for (int i =0;i<maison.pieces.length;i++)
			{
				pieceTemp[i] = maison.pieces[i];
			}
			pieceTemp[pieceTemp.length-1] = piece;
			maison.pieces = pieceTemp;
			
			return maison.pieces;
		}
		else
		{
			System.out.println("Merci de rentrer une valeur pour 'pièce'");
			return maison.pieces;
		}

	}
	
	public static double superficieTotale(Maison maison)
	{
		double surface =0;
		for (int i =0;i<maison.pieces.length;i++)
		{
			surface+=maison.pieces[i].superficie;
		}
		return surface;
	}
	
	public static double superficieEtage(Maison maison, int etage)
	{
		double surfaceEtage =0;
		
		for (int i =0;i<maison.pieces.length;i++)
		{
			if (maison.pieces[i].etage == etage)
			{
				surfaceEtage+=maison.pieces[i].superficie;
			}
		}
		return surfaceEtage;
	}
	
	public static double superficiePieces (Maison maison, String piece)
	{
		double surfacePieces =0;
		for (int i =0;i<maison.pieces.length;i++)
		{
			if (maison.pieces[i].typeof() == piece)
			{
				surfacePieces += maison.pieces[i].superficie;
			}
		}
		return surfacePieces;
	}
	public static int pieceNumber (Maison maison, String piece)
	{
		int pieceNbr =0;
		for (int i =0;i<maison.pieces.length;i++)
		{
			if (maison.pieces[i].typeof() == piece)
			{
				pieceNbr ++;
			}
		}
		return pieceNbr;
	}
	
}
