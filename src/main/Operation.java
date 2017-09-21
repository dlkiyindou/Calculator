package main;

public class Operation {
	private Operand operandR;
	private Operand operandL;
	private Operator operator;
	
	public Operation (Operator operator, Operand operandR, Operand operandL){
		this.operator = operator;
		this.operandL = operandL;
		this.operandR = operandR;
	}
	
	public Operation (){
		super();
	}
	
	public Operand getOperandR() {
		return operandR;
	}
	public void setOperandR(Operand operandR) {
		this.operandR = operandR;
	}
	public Operand getOperandL() {
		return operandL;
	}
	public void setOperandL(Operand operandL) {
		this.operandL = operandL;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public String toString (){
		StringBuilder sb = new StringBuilder("(");
		
		if (operandL != null) {
			sb.append(operandL.toString());
		}
		
		if (operator != null) {
			sb.append(operator.toString());
		}
		
		if (operandR != null) {
			sb.append(operandR.toString());
		}
		
		sb.append(")");
		
		return sb.toString();
	}


}
