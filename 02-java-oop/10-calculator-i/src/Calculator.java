import java.io.Serializable;

public class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private char operation;
	private double answer;

public Calculator (double operandOne, double operandTwo, char operation) {
	this.operandOne = operandOne;
	this.operandTwo = operandTwo;
	this.operation = operation;
}

public double getOperandOne() {
	return this.operandOne;
}
public double getOperandTwo() {
	return this.operandTwo;
}
public char getOperation() {
	return this.operation;
}
public void setOperandOne() {
	this.operandOne = operandOne;
}
public void setOperandTwo() {
	this.operandTwo = operandTwo;
}
public void setOperation() {
	this.operation = operation;
}

public void performOperation() {
	if (this.operation == '+'){
			this.answer = (this.operandOne + this.operandTwo);			
	}
	else if (this.operation == '-') {
			this.answer = (this.operandOne - this.operandTwo);
	}
}

public double getResults() {
	return this.answer;
}
}