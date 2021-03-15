
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {7,9,3,6};
		int n = numbers.length;
		int temp = 0;
		int count = 0;
		boolean swapped;
		for (int i = 0; i < n; i++) {
			
			count++;
			swapped = false;
			for(int j= 1;j<(n-i);j++) {
				count++;
				if(numbers[j-1] > numbers[j]) {
					//swap elements  
                    temp = numbers[j-1];  
                    numbers[j-1] = numbers[j];  
                    numbers[j] = temp; 
                    swapped = true;
                   
					
				}
			}

		}
	
		System.out.println(count);
		
		//printing the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		
	}

}
