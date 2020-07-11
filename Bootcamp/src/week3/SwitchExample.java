package week3;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("*******Calculator*****");
		System.out.print("Enter the first number");
		
		int number1 = reader.nextInt();
		
		System.out.print("Enter the second number");
		
        int number2 = reader.nextInt();
        
		int result = 0;
		
		System.out.print("Enter the operator");
		char operator = reader.next().charAt(0);
		// user input value

		switch(operator) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
			
		default:
			System.out.println("Not possible operation");
		
		}
		System.out.println("Result:" +result);

	}

}
