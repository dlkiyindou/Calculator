package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer une operation SVP");
		
		Scanner scanner = new Scanner(System.in);
		String stringOperation = scanner.nextLine();
		List <String> l = new ArrayList<>();
		
		Scanner parser = new Scanner(stringOperation);
		while (parser.hasNext()){
			String tmp = parser.next();
			l.add(tmp);
		}
		
		
		System.out.println(stringOperation);
		Operation operation = OperationFactory.build(l);
		System.out.println(operation);
		
	}

}
