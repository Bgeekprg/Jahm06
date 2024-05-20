package javaproject;

public class Employee {
 private String Name,Email;
// void setName(String Name)
// {
//	 this.Name=Name;
// }
// String getName()
// {
//	 return Name;
// }

public String getName() {
	return Name;
}

@Override
public String toString() {
	return "Employee [Name=" + Name + ", Email=" + Email + "]";
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}
}
