package array;

public class rotateArray {
	
	public void rotateNumOfTimes(int d,int arr[],int n) {
		for(int i=0; i<d; i++) {
			perRotate(arr,n);
		}
	}
	
	public void perRotate(int arr[], int n) {
		int temp,k;
		temp = arr[0];
		
		for(k=0; k<n-1; k++) {
			arr[k] = arr[k+1];
		}
		arr[k] = temp;
	}
	
	public void printArray(int arr[]) {
		for(int j=0; j<arr.length; j++) {
			System.out.print(" " + arr[j]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		rotateArray rotate = new rotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		
		System.out.println("Old Array: ");
		rotate.printArray(arr);
	
		rotate.rotateNumOfTimes(2,arr,arr.length);
		
		System.out.println("Rotated Array: ");
		rotate.printArray(arr);
	}

}
