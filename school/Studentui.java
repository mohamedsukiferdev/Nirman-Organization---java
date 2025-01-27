package school;

import java.util.Scanner;

public class Studentui {
	public static void main(String[] args) {
		Student st = new Student("thams", 1, 2345645557l, "sukifer@gmail.com");
		Scanner Sc = new Scanner(System.in);
		boolean isWork = true;
		
		while(isWork) {
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for update ");
			System.out.println("Enter 3  for show");
			System.out.println("Enter 4 for exit");
			System.out.println("Enter Your Choice");
			int key = Sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter name :");
				String name = Sc.next();
				Sc.nextLine();
				System.out.println("Enter id  :");
				int id = Sc.nextInt();
				Sc.nextLine();
				System.out.println("Enter phoneNumber :");
				long phoneNumber = Sc.nextLong();
				Sc.nextLine();
				System.out.println("Enter email :");
				String Email = Sc.next();
				st = new Student(name,id,phoneNumber,Email );

				break;
				
			case 2:
				System.out.println("press 1 for change id");
				System.out.println("press 2 for change name");
				System.out.println("press 3 for change phoneNumber");
				System.out.println("press 4 for change email");
				int a = Sc.nextInt();
				if (a==1) {
					System.out.println("Enter name :");
					String stname = Sc.next();
					st.setName(stname);
					Sc.nextLine();
				}
				else if(a==2) {
					System.out.println("Enter id :");
					int stid  = Sc.nextInt();
					st.setId(stid);	
				}
				else if(a==3) {
					System.out.println("Enter phoneNumber :");
					long stphoneNumber  = Sc.nextLong();
					st.setPhoneNume(stphoneNumber);	
				}
				else if (a==4) {
					System.out.println("Enter email :");
					String stEmail = Sc.next();
					st.setEmail(stEmail);
					Sc.nextLine();
				}
				else {
					System.out.println("select anyone");
				}
				break;
			case 3:
				System.out.println(st);
				break;
			case 4:
				isWork = false;
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}
	}

}
