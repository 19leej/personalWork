package objectOriented;

public class BankAccount {
	private double balance;
	private int account;
	private double interestRate;
	private double financeCharge;

	public BankAccount() {
		account = -999;
		balance = -999.0;
		interestRate = -999.0;
		financeCharge = -999.0;
	}

	public BankAccount(int newAccount, double newBalance, double newInterest, double newCharge) {
		account = newAccount;
		balance = newBalance;
		interestRate = newInterest;
		financeCharge = newCharge;
	}

	public void deposit(double deposit) {
		balance = balance + deposit;
	}

	public void withdraw(double withdraw) {
		balance = balance - withdraw;
	}

	public void addInterest(double interest) {
		interestRate = interestRate + (interest / 100);
	}

	public void setAccount(int number) {
		account = number;
	}

	public void setBalance(double number) {
		balance = number;
	}

	public void setCharge(double number) {
		financeCharge = number;
	}

	public void setInterest(double number) {
		interestRate = number;
	}

	public void financeCharge() {
		balance = balance - financeCharge;
	}

	public int accountNumber() {
		return account;
	}

	public double balance() {
		return balance;
	}

	public double charge() {
		return financeCharge;
	}
}
