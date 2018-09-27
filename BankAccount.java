/**
Steven Liu
**/

public class BankAccount 
{
	private String name;
	private int accNum;	
	private double balance;
	
	public BankAccount(String startName, int startAccNum)
	{
		name = startName;
		accNum = startAccNum;
		balance = 0;
	}
	
	public BankAccount(String startName, int startAccNum, double startBalance)
	{
		name = startName;
		accNum = startAccNum;
		balance = startBalance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "\n|Balance: " + balance + "\n"
				+ "|Account Number: " + accNum + "\n"
				+ "|Account Holder: " + name + "\n";
	}
	
}
