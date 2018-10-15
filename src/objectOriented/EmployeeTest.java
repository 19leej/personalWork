package objectOriented;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee karen = new Employee();
		System.out.println(karen.getWage());
		System.out.println("What is the employee's wage?");
		karen.setAge(input.nextDouble());
		System.out.println("The employee's wage is $" + karen.getWage() + " per hour.");
		System.out.println(karen.getExp());
		System.out.println("How many years of experience does the employee have?");
		karen.setExp(input.nextDouble());
		System.out.println("The employee has " + karen.getExp() + " years of experience.");
		karen.raiseWage();
		System.out.println("With a raise, the employee's wage will be $" + karen.getWage() + " per hour.");
		input.close();
	}

}
