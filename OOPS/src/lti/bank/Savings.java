package lti.bank;

public class Savings extends Account {

	public Savings() {
		super();
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);

	}

	@Override
	public void withdraw(double amount) throws BalanceException 
	{
		if (amount <= (balance -MIN_SAV_BAL))
		{
			balance -= amount;
		//txns[idx++]=new Transaction("DB",amount,balance);
	}
	else
	
		throw new BalanceException("insufficient balance");
	}

}
