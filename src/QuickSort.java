
public class QuickSort {

	public static void main(String [] args) {
		int[] arr = {2, 6, 2, 4, 8, 9 , 10, 12 };
		System.out.println(sortArray(arr));
	}
	
	private static int[] sortArray(int[] arr) {
		System.out.println(arr.length);
		if(arr.length < 2) {
			return arr;
		}
		int[] leftArr = new int[10];
		int leftArrCount =-1;
		int[] rightArr = new int[10];
		int rightArrCount = -1;
		int pivot = arr[0];
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] < pivot) {
				leftArr[++leftArrCount] = arr[i];
			}else {
				rightArr[++rightArrCount] = arr[i];
			}
		}
	
		return joinArrays(sortArray(leftArr), pivot, sortArray(rightArr));
	}
	
	private static int[] joinArrays (int[] leftArr, int pivot, int[] rightArr) {
		int count =0;
		int[] joinedArr = {};
		for(int i =0; i< leftArr.length; i++) {
			joinedArr[count] = leftArr[i];
			count++;
		}
		joinedArr[count] = pivot;
		for(int i =0; i< rightArr.length; i++) {
			joinedArr[count] = rightArr[i];
			count++;
		}
		return joinedArr;
	}
}
