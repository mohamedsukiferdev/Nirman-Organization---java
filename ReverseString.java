package day7;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Sukifer";
		String rev = "";
		for (int i = 6; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev.toLowerCase());
		System.out.println(rev.toUpperCase());

		// implicit
		int num = 100;
		double dNum = num;
		System.out.println("implicit casting int into double:" + dNum);

		// explicit
		long largerNum = 987654321;
		double smallNum = (double)largerNum;
		System.out.println("explicit casting :" + smallNum);

//	 array
		String fruits[]= {"apple", "mango", "orange"};
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}

	}
}
