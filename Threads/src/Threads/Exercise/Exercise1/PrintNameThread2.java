package Threads.Exercise.Exercise1;

public class PrintNameThread2 extends Thread {
	 PrintNameThread2(String name) {
	        super(name);
	       
	        start();
	    }
	   
	    public void run() {
	        String name = getName();
	        for (int i = 0; i < 10; i++) {
	            System.out.print(name);
	        }
	    }
}
