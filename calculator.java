// Java program for simple calculator

import java.util.Scanner;
class Calculator 
{

	public static void main(String[] args)
	{
		// stores two numbers
		double a, b;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		// take the inputs
		a = sc.nextDouble();

		b = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char Ps = sc.next().charAt(0);

		double p = 0;

		switch (Ps) {

		// case to add two numbers
		case '+':

			p = a + b;

			break;

		// case to subtract two numbers
		case '-':

			p = a - b;

			break;

		// case to multiply two numbers
		case '*':

			p = a * b;

			break;

		// case to divide two numbers
		case '/':

			p = a / b;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(a + " " + Ps + " " + b
						+ " = " + p);
	}
}
