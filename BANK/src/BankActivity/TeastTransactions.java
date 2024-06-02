package BankActivity;

public class TeastTransactions {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccname("Bhavesh");
		ac.setEmail("Bhavesh@gmail.com");
		ac.setBalance(10000);
		System.out.println(ac);
		
		Transaction t =new Transaction();
		
		t.deposite(ac,5000);
		System.out.println("Balance => "+ac.getBalance());
		
		t.withdraw(ac,1500);
		System.out.println("Balace => "+ac.getBalance());

	}

}
