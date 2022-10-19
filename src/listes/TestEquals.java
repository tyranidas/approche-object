package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville nice = new Ville ("Nice", 343000);
		Ville nice2 = new Ville ("Nice", 343000);
		
		System.out.println(nice.equals(nice2));;
	}

}
