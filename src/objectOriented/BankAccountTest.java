package objectOriented;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BankAccount savings = new BankAccount();
		BankAccount checking = new BankAccount();
		//savings account input
		System.out.println("Savings Account:");
		System.out.println("Account Number?(6 digit integer)");
		savings.setAccount(input.nextInt());
		System.out.println("Balance?");
		savings.setBalance(input.nextDouble());
		System.out.println("Interest Rate?");
		
	}

}
