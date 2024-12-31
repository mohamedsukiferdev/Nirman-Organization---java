package day8;

public class Calculator {
	int firstNum;
	int secondNum;
	void sub() {
		System.out.println("Subtraction :"+(firstNum-secondNum));
	}
	void add() {
		System.out.println("Addition :"+(firstNum+secondNum));
	}
	void mul() {
		System.out.println("Multiplication :"+(firstNum*secondNum));
	}
	
	void div() {
		System.out.println("Division :"+(firstNum/secondNum));
	}
	
	void modulus() {
		System.out.println("Modulus :"+(firstNum%secondNum));
	}
	public static void main(String[] args) {
	
		Calculator calc1 =new Calculator();
		calc1.firstNum = 35;
		calc1.secondNum = 10;
		calc1.add();
		calc1.sub();
		calc1.mul();
		calc1.div();
		calc1.modulus();
		
	}

}
