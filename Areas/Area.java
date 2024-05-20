package javaproject.Areas;

public class Area {
	double Length,Breadth;
	public void setDim(double l , double b)
	{
		Length=l;
		Breadth=b;
	}
	public double getArea()
	{
		return Length*Breadth;
	}
}
