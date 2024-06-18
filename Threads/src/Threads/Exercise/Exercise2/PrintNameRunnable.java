package Threads.Exercise.Exercise2;

public class PrintNameRunnable implements Runnable {
	String name;
	   
    PrintNameRunnable(String name) {
        this.name = name;
    }
   
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
