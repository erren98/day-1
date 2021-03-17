
public class Math {
	public int add(int... numbers) {
		int result = 0;
		 int count = 0;
		while (count < numbers.length) {
			result += numbers[count++];
			
		}
		return result;
	};
}

//add should take any number of integers and return their sum.
