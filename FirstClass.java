package javaproject;

public class FirstClass {

	public static void main(String[] args) {
		

		Employee e1 =new Employee();
		Employee e2 =new Employee();
		e1.setName("Bhavesh");
		e1.setEmail("bhavesh@gmail.com");
		e2.setEmail("xyz@gmail.com");
		e2.setName("xyz");
		System.out.println(e1);
		System.out.println(e2);
	}

}
