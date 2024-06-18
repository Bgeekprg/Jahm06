package Threads.Exercise.Exercise3;

public class DisplayAllThreads {
	

    public static Thread[] findAllThreads() {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
       
        ThreadGroup topGroup = group;
       
        while (group != null) {
            topGroup = group;
            group = group.getParent();
        }
       
        int estimatedSize = topGroup.activeCount() * 2;
        Thread[] slackList = new Thread[estimatedSize];
       
        int actualSize = topGroup.enumerate(slackList);
       
        Thread[] list = new Thread[actualSize];
        System.arraycopy(slackList, 0, list, 0, actualSize);
       
        return list;
}
	public static void main(String[] args) {
	       new SimpleThread("Boston").start();
	        new SimpleThread("New York").start();
	        new SimpleThread("Seoul").start();
	       
	        Thread[] tarray = findAllThreads();
	       
	        for (int i=0; i<tarray.length;i++){
	            System.out.println("Thread " + tarray[i].getName()
	            + " in thread group " + tarray[i].getThreadGroup().getName());
	        }
	       
	    }
	   
	   
}
