package saurabh.seventh.encapsulation;

public class MyApp {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Saurabh", "Singh");
		student.setUniqueID("XI", 1255988);
		System.out.println(student.getName());
		System.out.println(student.getUniqueID());
	}
}
