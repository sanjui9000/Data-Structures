package array;

class Student {
	public int roll_no;
	public String name;
	Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class printArrayObjects {
	public static void main(String args[]) {
		Student[] arr = new Student[] {
				new Student(1,"Aman"),
				new Student(2,"Vaibhav"),
				new Student(3,"Shikar"),
				new Student(4,"Dharmesh"),
				new Student(5,"Mohit")
				};
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at index " + i + " : " + " Roll number = " + arr[i].roll_no + " , Name : " + arr[i].name );
		}
	}
}
