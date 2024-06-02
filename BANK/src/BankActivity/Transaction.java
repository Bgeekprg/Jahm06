package BankActivity;

public class Transaction implements Bank{
	public void withdraw(Account ac,int amt)
	{
		if((amt > WITHDRAW_LIMIT) || (ac.getBalance()-amt) < MIN_BALANCE)
		{
			System.out.println("you can not withdraw");
		}
		else 
		{
		ac.setBalance((ac.getBalance()-amt));
		System.out.println("amount windrawn");
		}
	}
	public void deposite(Account ac,int amt)
	{
		if(amt <= DEPOSITE_LIMIT) {
		ac.setBalance((ac.getBalance()+amt));
		System.out.println("amount deposited");
		}
		else
		{
			System.out.println("Amount exceed than deposite limits");
		}
	}
}
