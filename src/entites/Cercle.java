package entites;

public class Cercle {

	double rayon;
	
	public Cercle (double r)
	{
		this.rayon = r;
	}
	
	public double perimetre()
	{
		return this.rayon*2*3.14;
	}
	
	public double aire()
	{
		return this.rayon*this.rayon*3.14;
	}
	
	public String toString()
	{
		return "Rayon = "+getRayon()+"m | périmètre = "+perimetre()+"m | superficie = "+aire()+"m²";
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
