package lti.stock;

public class StockSingleton {
	private static Stock lti;
private StockSingleton() {
}

	public static Stock getStock()
	{
	if(lti==null)
			lti=new Stock();
		return lti;
	}
}
