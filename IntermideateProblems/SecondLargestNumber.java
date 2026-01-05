package IntermediateProblems;

public class SecondLargestNumber {
public static int secondLargestNumber(int[] arr) {
		
		if(arr == null ||arr.length < 2)
			throw new IllegalArgumentException("Arrays Should consider Atleast Two Elements.");
		
		int first_largest_number = Integer.MIN_VALUE;
		int second_largest_number = Integer.MIN_VALUE;
		boolean found_second_element = false;
		
		for(int num:arr) {
			if(num > first_largest_number) {
				if(first_largest_number != Integer.MIN_VALUE) {
				second_largest_number = first_largest_number;
				found_second_element = true;
				}
				first_largest_number = num;
			
			}else if(num > second_largest_number && num != first_largest_number) {
				second_largest_number = num;
				found_second_element = true;
			}
		}
			if(!found_second_element)
				throw new IllegalArgumentException("May Be All the Elements are equal");
		
		return second_largest_number;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20};
		System.out.println("The Second Largest number in an array is: "+secondLargestNumber(arr));
	}
}
