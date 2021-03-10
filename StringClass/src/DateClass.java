import java.sql.Date;

public class DateClass {
	public static void main(String[] args) {
		Date date1 = new Date(2021,2,10);
		System.out.println(date1.getDay());
		System.out.println(date1.getDate());
		System.out.println(date1.getMonth());
		
		Date date2 = new Date(2021,2,10);
		
		//Reference Equality
		System.out.println(date1 == date2);
		
		//Data Equality
		System.out.println(date1.equals(date2));
		
	}

}
