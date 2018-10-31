
public class CreditCard 
{
	//fields
	private final int CARD_NUMBER;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	//constructors
	public CreditCard(int cardNum, double lim,  double intRate, String user)
	{
		CARD_NUMBER = cardNum;
		limit = lim;
		balance = 0;
		interestRate = intRate;
		holderName = user;
	}
	
	//methods
	/**
	 * adds the amount charged to the balance
	 * @param amountCharged		amount of money that is charged
	 */
	public void charge(double amountCharged)
	{
		if(balance + amountCharged <= limit)
		{
			balance = balance + amountCharged;
		}
	}
	/**
	 * subtracts the amount credited from the balance
	 * @param creditAmount		amount of money that is credited
	 */
	public void credit(double creditAmount)
	{
		balance = balance - creditAmount;
	}
	/**
	 * charges interest on the balance in the credit card
	 */
	public void chargeInterest()
	{
		balance = balance + (balance * interestRate);
	}
	/**
	 * returns card number
	 * @return card number
	 */
	public int getCardNumber()
	{
		return CARD_NUMBER;
	}
	/**
	 * returns card limit
	 * @return card limit
	 */
	public double getLimit()
	{
		return limit;
	}
	/**
	 * returns balance
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * returns interest rate
	 * @return interest rate
	 */
	public double getInterestRate()
	{
		return interestRate;
	}
	/**
	 * returns holder name
	 * @return holder name
	 */
	public String getHolderName()
	{
		return holderName;
	}
	/**
	 * returns string representation of the card
	 */
	public String toString()
	{
		return "Card Number: " + cardNumber + "Name: " + holderName + "Balance: " + balance + "Interest Rate: " + 
				interestRate + "Limit: " + limit;
	}
}
