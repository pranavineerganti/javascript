package banking;

public interface tranasaction 
{

	void deposit(double amount);
	void withdraw(double amount) throws InsufficientBalanceException;
}
