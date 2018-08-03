package lti.stock;

public class Stock implements Exchange {
	

	public Stock() {
	}
	public void getQuote()
	{System.out.println("getting stock quote");
	}
	public void viewQuote()
	{System.out.println("viewing stock quote");
	} 
	public void setQuote()
	{System.out.println("setting stock quote");
	}
}
