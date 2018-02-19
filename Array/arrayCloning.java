package array;

public class arrayCloning {
	
	public static void main(String args[]) {
		int intArray[] = {1,2,3};
		
		int cloneArray[] = intArray.clone();
		
		System.out.println(intArray == cloneArray);
		
	}

}
