package BankActivity;

public interface Bank {
	double MIN_BALANCE=1000;
	double WITHDRAW_LIMIT=20000;
	double DEPOSITE_LIMIT=15000;
	
	void withdraw(Account acc,int amt);
	void deposite(Account acc,int amt);
}
