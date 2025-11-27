package banking;

public class Savings extends BankAccount implements tranasaction {

	public Savings(int accountNumber, String accountHolderName, double balance, String accountType) {
		super(accountNumber, accountHolderName, balance, accountType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.out.print("Enter a valid amount");
		}
		else
		{
			balance+=amount;
			//System.out.print(balance);
		}
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException 
	{
		if(balance<amount)
		{
			throw new InsufficientBalanceException("Insufficient Funds");
		}
		else
		{
			balance-=amount;
		}
		
	}

}
