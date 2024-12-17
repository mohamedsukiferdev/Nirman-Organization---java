package day1;

import java.util.Scanner;

public class Operator {
	static Scanner sc = new Scanner (System.in);
	 public static void main (String[] args) {
		System.out.print("Enter the num1 : ");
		int num1= sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2= sc.nextInt();
		
		
//		arithmetic operators
		System.out.print("Arithmetic operators");
		System.out.println("Addition :"+ (num1+num2));
		System.out.println("Subtraction :"+ (num1-num2));
		System.out.println("Multiplication :"+ (num1*num2));
		System.out.println("Division :"+ (num1/num2));
		System.out.println("Modulus :"+ (num1%num2));
		
		
//		Relational operators
		
		System.out.println("Relational operators");
		System.out.println("Greaterthan :"+ (num1>num2));
		System.out.println("Lesserthan :"+ (num1<num2));
		System.out.println(">= :"+ (num1>=num2));
		System.out.println("<= :"+ (num1<=num2));
		System.out.println("== :"+ (num1==num2));
		System.out.println("!= :"+ (num1!=num2));
		
		// Logical
		System.out.print("Enter the num3 : ");
		int num3= sc.nextInt();
		System.out.print("Enter the num4 : ");
		int num4= sc.nextInt();
		System.out.print("Enter the num4 : ");
		int num5= sc.nextInt();
		System.out.print("Enter the num6 : ");
		int num6= sc.nextInt();
		System.out.print("Enter the num7 : ");
		int num7= sc.nextInt();
		System.out.print("Enter the num8 : ");
		int num8= sc.nextInt();
		System.out.println("Logical operators");
		System.out.println("&& :"+ ((num3>num4)&&(num5<num6)));
		System.out.println("|| :"+ ((num8>num4)||(num5>num7)));
		
		//Assignment
		int value = 10;
		
		System.out.println("Assignment operators");
		System.out.println("+= :"+ (value+=12));
		System.out.println("-= :"+(value-=12)) ;
		System.out.println("*= :"+ (value*=12));
		System.out.println("/= :"+(value/=12)) ;
		System.out.println("%= :"+(value%=12)) ;
		

//		Unary operators
		int val = 12;

		
		System.out.println("unary operators");
		System.out.println("++val :"+ (++val));
		System.out.println("--val :"+(--val)) ;
		
//		conditional operators
		String isTrue = (12%2==0)? "Even": "Odd";
		System.out.println(isTrue);
	}	
}
