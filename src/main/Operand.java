package main;

public class Operand extends Operation {
	
	private Integer value;

	public Operand(Operator operator, Operand operandR, Operand operandL) {
		super(operator, operandR, operandL);
	}
	
	public Operand (Operation operation){
		super(operation.getOperator(), operation.getOperandR(), operation.getOperandL());
	}
	
	public Operand (String operandR){
		super();
		value = new Integer (operandR);
	}
	
	public Integer evaluate (){
		if (this.getOperator() !=null && this.getOperandL() != null && this.getOperandR() != null){
			switch (this.getOperator()){
				case ADDITION :
					value = this.getOperandL().evaluate() + this.getOperandR().evaluate();
					break;
				case SOUSTRACTION :
					value = this.getOperandL().evaluate() - this.getOperandR().evaluate();
					break;
			}
		} else if (value == null){
			value = 0;
		}
		
		return value;	
	}
	
	public String toString() {
		if (value != null) {
			return value.toString();
		}
		
		return super.toString();
	}

}
