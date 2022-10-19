package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yy");
		Date date = cal.getTime();
		
		String cal2 = formateur.format(date) ;
		System.out.println(cal2);

		Locale france = Locale.FRANCE;
		Locale deutch = Locale.GERMAN;
		Locale chinese = Locale.CHINESE;
		Locale russe = new Locale ("ru", "RU");
		Locale[] langage= { chinese, deutch, france, russe};
		
		Calendar cal3 = Calendar.getInstance();
		Date date2 = cal3.getTime();
		
		for (int i = 0; i < langage.length; i++)
		{
			SimpleDateFormat formateur2 = new SimpleDateFormat("EEEE yy MMMM dd HH:mm:ss", langage[i]);
			String cal4 = formateur2.format(date2);
			System.out.println(cal4);
			
		}
		
	
		
	
		
		
		
		
	}

}
