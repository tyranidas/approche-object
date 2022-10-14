package maison;

public abstract class Piece {
	double superficie;
	int etage;
	
	public Piece(double superficie, int etage) {
		if (superficie >= 0 && etage >=0 )
		{
		this.superficie = superficie;
		this.etage = etage;
		}
		else
		{
			System.out.println("Merci de rentrer des données valides (positives notamment)");
		}
		
	}
	
	public abstract String typeof();
	
	
}
