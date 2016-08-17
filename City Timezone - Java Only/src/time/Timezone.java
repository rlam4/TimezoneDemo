package time;

import java.util.Calendar;
import java.util.TimeZone;
public class Timezone {

	public static void main(String[] args) {
		
		//This is a simple print out of time given a specific time zone
		Calendar c = Calendar.getInstance();		
		
		//Change parameter to whatever timezone desired
		c.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		//Prints in 24HR format
		System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE));
	}

}
