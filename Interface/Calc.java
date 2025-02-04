package Interface;

import java.util.Scanner;

public class Calc implements Calculator,Calculator1 {
	
	public void add(int a, int b) {
		System.out.println("addition"+ (a+b));
	}
	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction"+(a-b));
		
	}
	@Override
	public void div(int a, int b) {
		System.out.println("Division "+(a/b));
		
	}
	@Override
	public void mod(int a, int b) {
		System.out.println("Modulus"+(a%b));
	}
	@Override
	public void mul(int a, int b) {
		System.out.println("multiplication"+(a*b));		
	}
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = Sc.nextInt();
		System.out.println("Enter Second Number");
		int b = Sc.nextInt();
		
		Calc c = new Calc();
		c.add(a, b);
		c.sub(a, b);
		c.mul(a, b);
		c.div(a, b);
		c.mod(a, b);
		
	}

}
