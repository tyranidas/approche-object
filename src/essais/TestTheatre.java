package essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre chabada = new Theatre ("chabada", 500, 200, 2);
		
		System.out.println(chabada);
	
		
		chabada.inscrire(400,25);
		
		System.out.println(chabada);
		
		chabada.inscrire(600,25);
		
		System.out.println(chabada);
	
	}

}
