package Member_package;

public class Employee extends Member {
	private String specialization , dept;

	public Employee(int salary, int age, String name, String phone, String address, String specialization,
			String dept) {
		super(salary, age, name, phone, address);
		this.specialization = specialization;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", dept=" + dept + "]";
	}
	

}
