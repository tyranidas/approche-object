package maison;

public class Salon extends Piece {

	public Salon(double superficie, int etage) {
		super(superficie, etage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String typeof()
	{
		return "Salon";
	}
}
