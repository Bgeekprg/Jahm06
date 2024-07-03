package GenercMethod;
import java.util.*;
public class GenericMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gms = new GenericMethods();
		gms.display(29,"Bhavesh");
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		gms.getNumber(l1);
		
		ArrayList<Number> l2 = new ArrayList<Number>();
		l2.add(1.22f);
		l2.add(45.24f);
		l2.add(78.52f);
		
		gms.getInteger(l2);
		
		

	}

}
