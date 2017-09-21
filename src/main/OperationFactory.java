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
		Operation operation = null;
		int position = l.indexOf(Operator.ADDITION.getSymbol());
		Operator op = Operator.ADDITION;
		if (position == -1){
			position = l.indexOf(Operator.SOUSTRACTION.getSymbol());
			op = Operator.SOUSTRACTION;
		}
		if (position != -1){
			List <String> listLeft = l.subList(0, position);
			List <String> listRight = l.subList(position + 1, l.size());
			Operand opL = new Operand(build(listLeft));
			Operand opR = new Operand(build(listRight));
			operation = new Operation (op, opL, opR);
		}
		else{
			if (l.size() == 1){
				operation = new Operand (l.get(0));
			}
		}
			return operation;
	}
}
