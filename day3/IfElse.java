package day3;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Mark");
		int mark = sc.nextInt();
		if (mark >= 35 && mark <= 100) {
			System.out.println("pass");
			if (mark >= 90) {
				System.out.println("Grade : A");
			} else if (mark >= 80) {
				System.out.println("Grade : B");
			} else {
				System.out.println("Grade : C");
			}
		} else if (mark > 100) {
			System.out.println("invalid mark");
			

		} else {
			System.out.println("Fail");
		}

	}

}
