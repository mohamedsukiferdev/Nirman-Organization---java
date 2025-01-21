package day13;

import java.util.Scanner;

public class Ui {
	public static void main(String[] args) {
		book bk = new book();
		Scanner Sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for update ");
			System.out.println("Enter 3  for show");
			System.out.println("Enter Your Choice");
			int key = Sc.nextInt();

			if (key == 1) {
				System.out.println("Enter id : ");
				int id = Sc.nextInt();
				Sc.nextLine();
				System.out.println("Enter author : ");
				String author = Sc.next();
				System.out.println("Enter price : ");
				double price = Sc.nextDouble();
				bk = new book(id, author, price);

			} else if (key == 2) {
				System.out.println("press 1 for change id");
				System.out.println("press 2 for change author");
				System.out.println("press 3 for change price");
				int a = Sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("Enter id : ");
					int id = Sc.nextInt();
					bk.setId(id);
					Sc.nextLine();
					break;
				case 2:
					System.out.println("Enter author : ");
					String author = Sc.next();
					bk.setAuthor(author);
					break;
				case 3:
					System.out.println("Enter price : ");
					double price = Sc.nextDouble();
					bk.setPrice(price);
					break;

				default:
					break;
				}


			} else if (key == 3) {
				bk = new book(1,"suki",25);
				System.out.println(bk);
			} else {
				System.out.println("Enter the correct Choice ");
			}

		}

	}
}
