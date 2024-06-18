package simpleException;

public class CatchExercise {
	   public static void main(String[] args) {
	        try {
	            int[] a = new int[5];
	            a[5] = 30 / 5; 
	            System.out.println("Value assigned=> " + a[5]);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	            
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e.getMessage());
	        }

	        
	    }
}
