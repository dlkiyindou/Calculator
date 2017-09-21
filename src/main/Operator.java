package main;

public enum Operator {
	ADDITION("+"),
	SOUSTRACTION("-"),
	DIVISION("/"),
	MULTIPLICATION("*");
	
	private String symbol;
	
	Operator(String c){
		this.symbol = c;
	}
	
	public String getSymbol(){
		return symbol;
		
	}

}
