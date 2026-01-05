//Check if an array is sorted (ascending or descending).

package IntermediateProblems;

public class ArraySortedOrNot {

	public static void checkSortedOrNot(int[] arr) {
		if(arr==null||arr.length<2) {
			System.out.println("Array Has Been Sorted");
			return;
			}
		
		boolean ascending = true;
		boolean descending = true;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				ascending = false;
			}
			if(arr[i]>arr[i-1]) {
				descending = false;
			}
			
		}
		if(ascending)
			System.out.println("Array is sorted in Ascending Order");
		else if(descending)
			System.out.println("Array is sorted in Descending Order");
		else
			System.out.println("Array is not sorted in proper way");
		
	}
	
	public static void main(String[] args) {
		int[] arr = {30,40,20,50,10};
		checkSortedOrNot(arr);
		
	}
}
