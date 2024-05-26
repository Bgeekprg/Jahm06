package tns.personinfo;
import tns.country.*;

public class Person {
	private String name;
	private Country c;
	private State s;
	private int age;
	
	public Person() {
		this.name = "";
	}
	
	public Person(String name, Country c, State s,int age) {
		this.name = name;
		this.c = c;
		this.s = s;
		this.age=age;
		
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
	TaxCalc tc=new TaxCalc(120000,21);
	
	
	
}
