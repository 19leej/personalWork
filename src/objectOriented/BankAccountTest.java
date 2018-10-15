package objectOriented;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BankAccount savings = new BankAccount();
		BankAccount checking = new BankAccount();
		// savings account input
		System.out.println("Savings Account:");
		System.out.println("Account Number?(6 digit integer)");
		savings.setAccount(input.nextInt());
		System.out.println("Balance?");
		savings.setBalance(input.nextDouble());
		System.out.println("Interest Rate?(percentage)");
		savings.setInterest(input.nextDouble());
		System.out.println("//////////////////////////////");
		// checking account input
		System.out.println("Checking: Account:");
		System.out.println("Account Number?(6 digit integer)");
		checking.setAccount(input.nextInt());
		System.out.println("Balance?");
		checking.setBalance(input.nextDouble());
		System.out.println("Interest Rate?(percentage)");
		checking.setInterest(input.nextDouble());
		System.out.println("Finance charge amount?");
		checking.setCharge(input.nextDouble());
		System.out.println("//////////////////////////////");
		// stuff happening
		System.out.println("$100 has been deposited into the savings account.");
		savings.deposit(100);
		System.out.println("The interest rate of the checking account has been changed to 18%.");
		checking.setInterest(18);
		System.out.println("$1000 has been withdrawn from the checking account.");
		checking.withdraw(1000);
		System.out.println("Interest has been added to the savings account.");
		savings.interestCash();
		System.out.println("The checking account has been assessed a finance charge.");
		checking.financeCharge();
		System.out.println("//////////////////////////////");
		// displaying state
		System.out.println("Savings Account State:");
		System.out.println("Account number: " + savings.accountNumber());
		System.out.println("Balance: $" + savings.balance());
		System.out.println("Interest Rate: " + savings.interest() + "%");
		System.out.println("//////////////////////////////");
		System.out.println("Checking Account State:");
		System.out.println("Account number: " + checking.accountNumber());
		System.out.println("Balance: $" + checking.balance());
		System.out.println("Interest Rate: " + checking.interest() + "%");
		System.out.println("Finance Charge: $" + checking.charge());

	}

}
