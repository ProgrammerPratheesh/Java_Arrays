//Find the missing number in a given range of consecutive numbers.

package IntermediateProblems;

import java.util.HashSet;

public class FindAllMissingNumber {

	public static void findAllMissingNumber(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println("Missing Numbers are: ");
		for(int i=min+1;i<max;i++) {
			if(!set.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,100};
		findAllMissingNumber(arr);
	}
}
