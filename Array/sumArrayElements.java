package array;

public class sumArrayElements {
	
	public static void main(String args[]) {
		int arr[] = {3,1,2,5,4};
		System.out.println("Sum of array elements is " + sum(arr) + ".");
	}
	
	public static int sum(int arr[]) {
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}

}
