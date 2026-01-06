// Find the frequency of each element in the array.

package IntermediateProblems;

public class FrequencyOfAnElement {

	public static void frequencyOfElement(int[] arr) {
		boolean visited[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
		if(visited[i]) {
			continue;
		}
		int count = 1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] == arr[j]) {
				count++;
				visited[j] = true;
			}
		}
		System.out.println(arr[i]+" Appears "+count+" Times.");
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {10,20,10,30,40,30,20,20,20,20,2,2,2,2,2,2};
		frequencyOfElement(arr);
	}
}
