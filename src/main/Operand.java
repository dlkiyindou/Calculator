package main;

public class Operand extends Operation {
	public Operand(Operator operator, Operand operandR, Operand operandL) {
		super(operator, operandR, operandL);
	}
	
	public Operand (Operation operation){
		super(operation.getOperator(), operation.getOperandL(), operation.getOperandR());
		setValue(operation.getValue());
	}
	
	public Operand (String operandR){
		super();
		setValue(new Integer (operandR));
	}
	
	
	public String toString() {
		if (getValue() != null) {
			return getValue().toString();
		}
		
		return super.toString();
	}

}
