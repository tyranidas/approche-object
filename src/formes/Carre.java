package formes;

public class Carre extends Rectangle {

	
	public Carre(double cote) {
		super(cote, cote);
		
	}
	
	public String toString()
	{
		return "Un carré de coté "+this.largeur+"cm.";
	}
	
}
