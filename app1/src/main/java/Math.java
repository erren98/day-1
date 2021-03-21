
public class Math {
	public int add(int... numbers) {
		int result = 0;
		int count = 0;
		while (count < numbers.length) {
			result += numbers[count++];

		}
		return result;
	}

	/**
	 * takes 2 numbers and multiply them
	 * 
	 * @author Abhishek
	 * 
	 */
	int multiply(int... numbers) {
		int result = 1;
		int count = 0;
		while (count < numbers.length) {
			int currentNumber = numbers[count++];
			if(currentNumber<0) {	
				throw new IllegalArgumentException();
			}
			result *= currentNumber;

		}
		return result;

	}
}

//add should take any number of integers and return their sum.
