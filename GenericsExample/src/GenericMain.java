
public class GenericMain {

	public static void main(String[] args) {
		GenericClass<String> name =new GenericClass<String>();
		name.setData("Bhavesh");
		System.out.println(name);
		
		GenericClass<Integer> num =new GenericClass<Integer>();
		num.setData(29);
		System.out.println(num);
	}

}
