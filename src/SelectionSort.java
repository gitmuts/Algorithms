/*
 * Used to sort arrays, big o notation is O(n^2)
 */
public class SelectionSort {

	static int arr[] = { 2, 6, 18, 19, 12, 5, 6, 100, 76 };
	
	public static void main(String[] args) {
	    for(int x=0; x < arr.length; x++) {
	    	System.out.print(arr[x] + " ");
	    }
		for(int i =0; i< arr.length; i++) {
			
			for(int y=i+1; y< arr.length; y++) {
				
				if(arr[y] < arr[i]) {
					//smaller
					int smaller = arr[y];
					arr[y] = arr[i];
					arr[i] = smaller;
				}
			}
		}
		
		System.out.println("Array after sorting: ");
		
		for(int x=0; x<arr.length; x++) {
	    	System.out.print(arr[x] + " ");
	    }
	}
}
