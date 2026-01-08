// Move all zeros to the end of the array without changing the order of non-zero elements

package IntermediateProblems;

public class MoveZerosToEnd {
	

	    public static void moveZeros(int[] arr) {
	        int index = 0;

	       
	        for (int num : arr) {
	            if (num != 0) {
	                arr[index++] = num;
	            }
	        }

	        
	        while (index < arr.length) {
	            arr[index++] = 0;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 3, 12};
	        moveZeros(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


