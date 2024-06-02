package Member_package;

public class Manager extends Member {
	private String specialization , dept;

	public Manager(int salary, int age, String name, String phone, String address, String specialization, String dept) {
		super(salary, age, name, phone, address);
		this.specialization = specialization;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [specialization=" + specialization + ", dept=" + dept + "]";
	}
	
	
}
