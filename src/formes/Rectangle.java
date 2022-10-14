package formes;

public class Rectangle extends Forme {

	double largeur;
	double longueur;
	
	public Rectangle(double largeur, double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}


	public double calculerPerimetre()
	{
		return this.largeur*2+this.longueur*2;
	}
	
	
	public double calculerSurface()
	{
		return this.largeur*this.longueur;
	}
	
	public String toString()
	{
		return "Un rectangle de largeur "+this.largeur+"cm et de longueur "+this.longueur+"cm.";
	}
}
