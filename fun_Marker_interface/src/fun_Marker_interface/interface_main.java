package fun_Marker_interface;

public class interface_main implements GreetingInterface{
	public void greet()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
	interface_main ob=new interface_main();
	ob.greet();
		
	}

}
