package day9;

import java.util.Scanner;

public class UI {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		int firstNum = sc.nextInt();
		System.out.println("Enter Second Number");
		int secondNum = sc.nextInt();

		Calculator userInterface = new Calculator();
		 
		
		System.out.println("addition :"+userInterface.add(firstNum, secondNum));
		System.out.println("subtration :"+userInterface.sub(firstNum, secondNum));
		System.out.println("addition :"+userInterface.mul(firstNum, secondNum));
		System.out.println("addition :"+userInterface.div(firstNum, secondNum));
		System.out.println("addition :"+userInterface.modulus(firstNum, secondNum));
		
		
		
	}

}

