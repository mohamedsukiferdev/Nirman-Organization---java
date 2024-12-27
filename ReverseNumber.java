package day6;

public class ReverseNumber {
public static void main(String[] args) {
	int add =0;
	int sum=0;

	for(int i = 50; i>=1; i--) {
		System.out.println(i);
	}
	
	for(int i = 1; i<=100; i++) {
		if(i%2!=0) {
			add+=i;
		}
		
	}
	System.out.println(add);
	
	for(int i = 1; i<=30; i++) {
		if(i%3==0) {
			sum+=i;
		}
		
	}
	System.out.println(sum);
}
}
