package tns.personinfo;
import tns.country.*;
public class Person_info {
	public static void main(String args[])
	{	 Country c1=new Country("India");
		 State s1=new State("Gujarat");
		Person p=new Person("Bhavesh",c1,s1);
		System.out.println(p);
		
	}
}
