package javaproject.Areas;

import javaproject.Area;

public class MainClass {

	public static void main(String[] args) {
		Area a=new Area();
		a.setDim(12,11.5);
		System.out.println("Area of rectangle => "+ a.getArea());;
	}

}
