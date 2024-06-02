package Member_package;

public class Member {
	private int salary,age;
	private String name,Phone,Address;
	
	public Member(int salary, int age, String name, String phone, String address) {
		this.salary = salary;
		this.age = age;
		this.name = name;
		Phone = phone;
		Address = address;
	}

	public void printSalary()
	{
		System.out.println("salary = "+salary);
	}
}
