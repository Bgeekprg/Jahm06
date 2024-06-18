package ListExample;
import java.util.*;
public class QueueState {

	public static void main(String[] args) {
		Queue<String> q= new LinkedList<String>();
		q.add("Gujarat");
		q.offer("Rajasthan");
		q.offer("Maharashtra");
		q.add("Punjab");
		q.add("Himachal Pradesh");
		q.add("U.P");
		q.add("Odisha");
		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println("Head " + q.peek());
		System.out.println("delete head using poll " + q.poll());
		System.out.println("delete head using remove " + q.remove());
		System.out.println(q);
		

	}

}
