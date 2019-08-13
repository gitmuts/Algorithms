import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recursive {

	static int arr[] = {1, 2, 3, 4, 5,6, 7, 8, 9};
	
	static List<Integer> numbers = new ArrayList<>();
	
	int count =0;
	static int maxNum=0;
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
		generateRandomNumbers(10000);
		
		System.out.println(numbers.toString());
		System.out.println("Largest number "+ findMaxNum(numbers));
		
	}
	
	private static int findMaxNum(List<Integer> numbers) {
		if(numbers.size() == 1) {
			if(numbers.get(0) > maxNum) {
				return numbers.get(0);
			}else {
				return maxNum;
			}
		}
		
		int lastItemIndex = numbers.size()-1;
		
		if(numbers.get(lastItemIndex) > maxNum) {
			maxNum = numbers.get(numbers.size() -1);
		}
		numbers.remove(lastItemIndex);
		return findMaxNum(numbers);
	}
	private static long factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}
	
	private static void generateRandomNumbers(int num) {
		Random rand = new Random();
		for(int i=0; i< num; i++) {
		   numbers.add(rand.nextInt(100000));
		}
	}
}
