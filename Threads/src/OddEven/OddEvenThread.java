package OddEven;

class Odd extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try 
			{	
				sleep(500);
				if(i%2!=0)
					System.out.println(i + " Odd");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class Even extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try 
			{	
				sleep(1000);
				if(i%2==0)
					System.out.println(i + " Even");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class OddEvenThread {

	public static void main(String[] args) {
		
		Odd o = new Odd();
		Even e = new Even();
//		o.setPriority(Thread.MAX_PRIORITY);
		o.start();
//		try {
//			o.join();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		e.start();
		

	}

}
