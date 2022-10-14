package maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String typeof()
	{
		return "Cuisine";
	}
}
