package array;

public class circularArrayRotation {
	
	public void rotateCircular(int arr[], int n) {
		int temp = arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		circularArrayRotation car = new circularArrayRotation();
		
		System.out.println("Given array is:");
		car.printArray(arr);
		
		car.rotateCircular(arr, arr.length);
		System.out.println("Circular rotated array is:");
		car.printArray(arr);
	}
}
