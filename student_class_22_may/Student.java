package javaproject;

public class Student {
	
	private String Name;
	public Student() {
		Name = "Unknown";
	}
	public Student(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + "]";
	}
	
	
}
