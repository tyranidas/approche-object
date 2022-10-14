package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle a = new Cercle(2);
		Cercle b = new Cercle(10);
		System.out.println(a);
		System.out.println(b);	
		
		Cercle c = CercleFactory.createCercle(25);
		System.out.println(c);	
	}

}
