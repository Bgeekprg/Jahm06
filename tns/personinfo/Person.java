package tns.personinfo;
import tns.country.*;
public class Person {
	private String name;
	private Country c;
	private State s;
	public Person() {
		this.name = "";
	}
	
	public Person(String name, Country c, State s) {
		this.name = name;
		this.c = c;
		this.s = s;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", c=" + c + ", s=" + s + "]";
	}
	
	
	
}
