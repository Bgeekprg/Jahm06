
public class ThreadMain {

	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		tc.start();
		
		RunnableInterface ri = new RunnableInterface(); 
		Thread t = new Thread(ri);
		t.start();
		
		

	}

}
