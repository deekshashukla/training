
//	public Account(String holder, double balance) {
//		super();
//		this.acntno = autogen++;
//		this.holder = holder;
//		this.balance = balance;
//		
//		txns= new Transaction[10];
////		
////		txns[idx++]=new Transaction("OB",balance,balance);
//	}
//
//	public void summary() {
//		System.out.println("A/C No.:" + acntno);
//		System.out.println("Holder:" + holder);
//		System.out.println("Balance:" + balance);
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void deposit(double amount) {
//		balance += amount;
//		txns[idx++]=new Transaction("CR",amount,balance);
//	}
//
//	//public abstract void withdraw(double amount) ;
////		if (amount <= balance) 
////			balance -= amount;
////		 else 
////			System.out.println("insufficient funds");
//	
//public void statement()
//{
//	System.out.println("statement of A/C:"+ acntno);
//	for(int i=0;i<idx;i++)
//		System.out.println(txns[i]);
//}
//}

package lti.bank;

import java.util.Vector;

public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	protected int idx;
	Vector<Transaction> vtr = new Vector<>();
	private static int autogen = INIT_ACNT_NO;

	public Account() {
	}

	public Account(String holder, double balance) {

		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		// tr = new Transactions[10]; // Instantiating Transaction array for the account
		// Vector<Transactions> vtr = new Vector<Transactions>();
	}

	public void summary() {
		System.out.println("A/c No: " + accNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		vtr.add(new Transaction("Cr", amount, balance));
	}

	public void statement() {
		System.out.println("Statement of Acc. " + accNo);

		for (Transaction t : vtr)
			System.out.println(t);
		// System.out.println(tr[i]);
		System.out.println("\n\n\n");
	}

}