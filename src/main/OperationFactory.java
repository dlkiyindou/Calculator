package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OperationFactory {
	public static List<String> parse (String s){
		List<String> myList = new LinkedList<String>();
		Scanner scanner = new Scanner(s);
		while (scanner.hasNext()) {
			myList.add(scanner.next());
		}
		scanner.close();
		return myList;
		
		
		
	}
	
	public static Operation build (List<String> l){
		int position = l.indexOf(Operator.ADDITION.getSymbol());
		if (position == -1){
			position = l.indexOf(Operator.SOUSTRACTION.getSymbol());
		}
//		while (l.iterator().hasNext()){
//			String current = l.iterator().next();
//			if (Operator.ADDITION.getSymbol().equals(current) || Operator.SOUSTRACTION.getSymbol().equals(current)){
//				
//			}
//		}
		return null;
		
	}
}
