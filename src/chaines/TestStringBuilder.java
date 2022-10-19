package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		
		
		
		
		long debut = System.currentTimeMillis();
		// Code à chronométrer
		
		StringBuilder bbis = new StringBuilder();
		for (int i = 0; i < 100000; i++)
		{
			bbis.append(i);
		}
		
	
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		debut = System.currentTimeMillis();
		String b = "pouet";
		for (int i = 0; i < 100000; i++)
		{
			
			b = b+i;
		}
		
	
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
