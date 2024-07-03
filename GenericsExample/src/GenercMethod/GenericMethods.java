package GenercMethod;
import java.util.*;
public class GenericMethods {
	public <T,K> void display(T m , K msg) {
		System.out.println( m + "   "+  msg);
	}
public void getList(ArrayList<?> arr) {
		
		for(Object o :  arr) {
			System.out.println(o);
		}
		
		
	}
	
///  ? extends  == upperbound 	(Class and it children)
public void getNumber(ArrayList<? extends Number> arr) {
		
		for(Object o :  arr) {
			System.out.println(o);
		}
		
		
	}

// ? super --- lower bounded   (class that we passed and its parent)


public void getInteger(ArrayList<? super Integer> arr) {
	
	for(Object o :  arr) {
		System.out.println(o);
	}
	
	
}

}
