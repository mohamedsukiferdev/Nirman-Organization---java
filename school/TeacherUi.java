package school;

import java.util.Scanner;

public class TeacherUi {
	public static void main(String[] args) {
		Teacher th = new Teacher(1, "suki", 12345678910l, 25);
		Scanner Sc = new Scanner(System.in);
		boolean isWork = true;
		while (isWork) {
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for update ");
			System.out.println("Enter 3  for show");
			System.out.println("Enter 4 for exit");
			System.out.println("Enter Your Choice");
			int key = Sc.nextInt();

			if (key == 1) {
				System.out.println("Enter id :");
				int id = Sc.nextInt();
				Sc.nextLine();
				System.out.println("Enter name :");
				String name = Sc.next();
				System.out.println("Enter phoneNumber :");
				long phoneNumber = Sc.nextLong();
				Sc.nextLine();
				System.out.println("Enter Salary :");
				int salary = Sc.nextInt();
				th = new Teacher(id, name, phoneNumber, salary);

			} else if (key == 2) {
				System.out.println("press 1 for change id");
				System.out.println("press 2 for change name");
				System.out.println("press 3 for change phoneNumber");
				System.out.println("press 4 for change salary");
				int a = Sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("Enter id : ");
					int id = Sc.nextInt();
					th.setId(id);
					Sc.nextLine();
					break;
				case 2:
					System.out.println("Enter name : ");
					String name = Sc.next();
					th.setName(name);
					break;
				case 3:
					System.out.println("Enter phoneNumber : ");
					long phoneNumber = Sc.nextLong();
					th.setPhoneNumber(phoneNumber);
					break;
				case 4:
					System.out.println("Enter salary : ");
					double salary = Sc.nextDouble();
					th.setSalary(salary);
					break;
					
				default:
					break;
				}

			} else if (key == 3) {
				System.out.println(th);
			}
			else if(key==4) {
				isWork = false;
				System.out.println("Thank you");
			}
			else {
				System.out.println("Enter the correct Choice ");
			}

		}
	}
}
