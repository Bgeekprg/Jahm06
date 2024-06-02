package Rect_and_Sq;

public class Square extends Rectangle{
	private double s;

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}
	
	public double area()
	{
		return s*s;
	}
	public double perimeter()
	{
		return 4*(s*s);
	}
	
	
}
