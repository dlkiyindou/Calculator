package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer une operation SVP");
		
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.nextLine();
		
		System.out.println(operation);
		
		Scanner scanner2 = new Scanner(operation);
		int firstInt = scanner2.nextInt();
		String operator = scanner2.next();
		int secondInt
		
		System.out.println(firstInt);
		System.out.println(operator);
		
		scanner.close();
		scanner2.close();

	}

}
