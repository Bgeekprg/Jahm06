package Rect_and_Sq;

public class AreaMain {

	public static void main(String[] args) {
			Rectangle r=new Rectangle();
			Square sq=new Square();
			r.setLength(10);
			r.setBreadth(20);
			sq.setS(40);
			System.out.println("square area = "+sq.area() +" perimeter = "+ sq.perimeter());
			System.out.println("rectangle area = "+r.area() +" perimeter = "+ r.perimeter());

	}

}
