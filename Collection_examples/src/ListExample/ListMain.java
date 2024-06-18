package ListExample;
import java.util.*;
public class ListMain {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i =1;i<=10;i++)
			l.add(i);
		
		l.forEach(n -> System.out.println(n));
//		Iterator ir = l.iterator();
//		while(ir.hasNext())
//			System.out.println(ir.next());
		
		System.out.println(l);
		
		int sum=0;
		for(int i:l)
		{
			if(i%2==0)
				sum+=i;
		}

		System.out.println("Sum of even => "+ sum);
	}

}
