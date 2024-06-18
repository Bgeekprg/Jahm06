package Threads.Exercise.Exercise2;

public class PrintNameRunnable2 implements Runnable{
	  Thread thread;
	   
	    PrintNameRunnable2(String name) {
	        thread = new Thread(this, name);
	        thread.start();
	    }
	   
	    
	    public void run() {
	        String name = thread.getName();
	        for (int i = 0; i < 10; i++) {
	            System.out.print(name);
	        }
	    }
}
