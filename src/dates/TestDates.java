package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date d1 = new Date(220,9,19);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yy");
		String d2 = formateur.format(d1);
		System.out.println(d2);
		
		Date d3 = new Date(116,4,19,23,59,30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yy 'à' HH:mm:ss");
		String d4 = formateur2.format(d3);
		System.out.println(d4);
		
		Date d5 = new Date();
		String d6 = formateur.format(d1);
		System.out.println(d6);
	}

}
