package main;

public class Operation {
	private Operand operandR;
	private Operand operandL;
	private Operator operator;
	private Integer value;
	
	public Operation (Operator operator, Operand operandL, Operand operandR){
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
		
		if (operandL != null && operator != null && operandR != null) {
			sb.append(operandL.toString());
			sb.append(" ");
			sb.append(operator.toString());
			sb.append(" ");
			sb.append(operandR.toString());
		} else {
			sb.append(getValue());
		}
		sb.append(")");
		
		return sb.toString();
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer evaluate() {
		Integer value = null;
		
		if (getValue() == null){
			if (this.getOperator() !=null && this.getOperandL() != null && this.getOperandR() != null){
				switch (this.getOperator()){
					case ADDITION :
						value = this.getOperandL().evaluate() + this.getOperandR().evaluate();
						break;
					case SOUSTRACTION :
						value = this.getOperandL().evaluate() - this.getOperandR().evaluate();
						break;
					case MULTIPLICATION : 
						value = this.getOperandL().evaluate() * this.getOperandR().evaluate();
						break;
					case DIVISION : 
						value = this.getOperandL().evaluate() / this.getOperandR().evaluate();
						break;
				default:
					break;
				}
			} else {
				value = 0;
			}
			
			setValue(value);
		}

		
		
		return getValue();	
	}


}
