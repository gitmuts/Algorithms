/*
 * Binary search on a sorted array
 * It improves it performances by halving the possibilities in each run
 * worst case complexity is log n
 */
public class BinarySearch {
	
	static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	public static void main(String[] args) {
		
		int search = 2;
		Integer result = binarySearch(search);
		if(result != null) {
			System.out.println("Number found");
		} else {
			System.out.println("Number not found");
		}
	}
	
	private static Integer binarySearch(int num) {
		int high = arr.length -1;
		int low = 0;
		while(low <= high) {
			int guess = (low+ high) / 2;
			System.out.println("guess is "+ guess);
			if(guess == num) {
				return num;
			}else {
				if(guess > num) {
					high = guess - 1;
				} else {
					low = guess + 1;
				}
			}
		}
		
		return null;
	}
}
