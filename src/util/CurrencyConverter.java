package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double amountToBePaid(double price, double boughtDollars) {
		return ((price*IOF)+price)*boughtDollars;
	}
}
