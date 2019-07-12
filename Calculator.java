public class Calculator {
	
	//Attributes
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double mathTotal = 0.0;
	private String operation = "";
	
	//Constructors
	public Calculator() {
	}
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	
	//Methods
	public void performOperation() {
		if(this.operation.equals("+")) {
			Double total = this.operandOne + this.operandTwo;
			this.mathTotal = total;
		}
		else if(this.operation.equals("-")) {
			Double total = this.operandOne - this.operandTwo;
			this.mathTotal = total;
		}
	}
	public void getResults() {
		System.out.println(this.mathTotal);
	}	
}