package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		
		
		
		
		long debut = System.currentTimeMillis();
		// Code à chronométrer
		
		StringBuilder bbis = new StringBuilder();
		for (int i = 0; i < 100; i++)
		{
			bbis.append(i);
		}
		
		System.out.println(bbis);
		
		String b = null;
		for (int i = 0; i < 100; i++)
		{
			
			b = b+i;
		}
		
		System.out.println(b);
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
