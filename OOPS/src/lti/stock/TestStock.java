package lti.stock;
import lti.stock.Broker;
import lti.stock.StockSingleton;
import lti.stock.Holder;
import lti.stock.Exchange;

public class TestStock {
 public static void main(String args[]) {
	 
	 
	 Holder h=StockSingleton.getStock();
	 h.viewQuote();
	 
	 Broker b=StockSingleton.getStock();
	 b.getQuote();
	 
	 System.out.println(h==b);
	// TODO Auto-generated method stub

}
}

