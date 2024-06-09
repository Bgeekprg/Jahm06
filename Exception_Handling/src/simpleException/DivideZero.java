package simpleException;
import java.util.*;
public class DivideZero {

	public static void main(String[] args) {
		int n1 ,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 => ");
		n1=sc.nextInt();
		System.out.print("Enter n2 => ");
		n2=sc.nextInt();
		try
		{
			System.out.println("result => "+(n1/n2));
		}
		catch(Exception e)
		{
			System.out.println("number can not be "+e.getMessage());
		}
		

	}

}
