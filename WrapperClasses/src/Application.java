import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		int a= 1;
		Integer b =a; //autoboxing 
		Double d = 23.4; //autoboxing 
		//double primitiveDouble = d;//auto-unboxing 
		
		System.out.println(d.compareTo(33.3));
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(56); //primitive(int) converted to Wrapper class object(Integer)
		
	}
	

}
