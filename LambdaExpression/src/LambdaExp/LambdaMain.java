package LambdaExp;

interface Calculate
{
	int square(int no);
}
public class LambdaMain {

	public static void main(String[] args) {
		sayHello obj= ()-> System.out.println("Hello from Bhavesh");
		obj.letGreet();
		
		Calculate c1= (no)-> no*no;
		System.out.println(c1.square(10));

	}

}
