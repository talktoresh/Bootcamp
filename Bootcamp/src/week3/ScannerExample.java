package week3;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = reader.nextLine();
		System.out.println("The entered name:" +name);
	}

}
