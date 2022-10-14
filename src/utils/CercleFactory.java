package utils;

import entites.Cercle;

public class CercleFactory {
	
	
	
	public static Cercle  createCercle(double r)
	{
		return new Cercle(r);
	}
	
	
	
}
