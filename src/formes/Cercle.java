package formes;

public class Cercle extends Forme {

	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	public double calculerPerimetre()
	{
		return this.rayon*2*3.14;
	}
	
	
	public double calculerSurface()
	{
		return this.rayon*this.rayon*3.14;
	}
	
	public String toString()
	{
		return "Un cercle de rayon "+this.rayon+"cm.";
	}
	
}
