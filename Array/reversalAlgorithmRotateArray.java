package array;

public class reversalAlgorithmRotateArray {
	
	public void rotateArr(int arr[],int d,int n) {
		perRotateArray(arr, 0, d-1 );
		perRotateArray(arr, d, n-1);
		perRotateArray(arr,0,n-1);
	}
	
	public void perRotateArray(int arr[], int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public void printArray(int arr[]) {
		for(int j=0; j<arr.length; j++) {
			System.out.print(" " + arr[j]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		reversalAlgorithmRotateArray rarray = new reversalAlgorithmRotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		rarray.rotateArr(arr, 2, arr.length);
		rarray.printArray(arr);
	}

}
