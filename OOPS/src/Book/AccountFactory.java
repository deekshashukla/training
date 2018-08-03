package Book;

import lti.bank.Bank;
import lti.bank.Current;
import lti.bank.Savings;

public class AccountFactory {
public Bank openAccount(String type, String holder)
{
Bank acnt=null;
if (type.equalsIgnoreCase("savings"))
		acnt=new Savings(holder);
		else
			acnt=new Current(holder);
		
		return acnt;
}
}
