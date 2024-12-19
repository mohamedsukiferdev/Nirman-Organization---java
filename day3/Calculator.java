package day3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Key value :");
		int key = sc.nextInt();
		

		switch (key) {
		case 1:{
			System.out.println("Enter First Number :");
			int fNum = sc.nextInt();
			System.out.println("Enter Second Number :");
			int sNum = sc.nextInt();
			System.out.println("Addition :"+(fNum+sNum));

			break;
		}
		case 2:{
			System.out.println("Enter First Number :");
			int fNum = sc.nextInt();
			System.out.println("Enter Second Number :");
			int sNum = sc.nextInt();
			System.out.println("Subtraction :"+(fNum-sNum));

			break;
		}
		case 3:{
			System.out.println("Enter First Number :");
			int fNum = sc.nextInt();
			System.out.println("Enter Second Number :");
			int sNum = sc.nextInt();
			System.out.println("Multiplication :"+(fNum*sNum));

			break;
		}
		case 4:{
			System.out.println("Enter First Number :");
			int fNum = sc.nextInt();
			System.out.println("Enter Second Number :");
			int sNum = sc.nextInt();
			System.out.println("Division :"+(fNum/sNum));

			break;
		}
		case 5:{
			System.out.println("Enter First Number :");
			int fNum = sc.nextInt();
			System.out.println("Enter Second Number :");
			int sNum = sc.nextInt();
			System.out.println("modulus :"+(fNum%sNum));

			break;
		}





		default:{
			System.out.println("Invalid");
		}
			break;
		}
	}
}
