package counter;

public class CounterMain {

	public static void main(String[] args) {
		StaticCounter s = new StaticCounter();
		StaticCounter s1 = new StaticCounter();
		StaticCounter s2 = new StaticCounter();
		
		System.out.println(StaticCounter.cnt);
	}

}
