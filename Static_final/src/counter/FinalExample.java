package counter;

public class FinalExample {
	private final double PI=3.14;
	public double areaOfCircle(double r)
	{
		return PI*(r*r);
	}
	public static void main(String[] args) {
		
		FinalExample fe= new FinalExample();
		System.out.println("Area of Circle =>  "+fe.areaOfCircle(85));
	}

}
