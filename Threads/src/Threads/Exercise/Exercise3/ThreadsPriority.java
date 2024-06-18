package Threads.Exercise.Exercise3;

public class ThreadsPriority {

	public static void main(String[] args) {
		   Thread t1 = new SimpleThreadPriority("Boston");
	        t1.start();
	        t1.setPriority(10);
	       
	        Thread t2 = new SimpleThreadPriority("New York");
	        t2.start();
	        t2.setPriority(5);
	       
	        Thread t3 = new SimpleThreadPriority("Seoul");
	        t3.start();
	        t3.setPriority(1);

	}

}
