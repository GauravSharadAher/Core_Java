package Student;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println(" 1.Add Sudent"
					+"\n 2.Display all"
					+"\n 3. Search by id"
					+"\n 4. Search by name"
					+"\n 5.Calculate GPA of student"
					+"\n 6.exit");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:  
				StudentService.addStudent();
				break;
				
			case 2: 
				StudentService.display();
				break;
				
			case 3:
				System.out.println("Enter the id");
				int id= sc.nextInt();
				StudentService.searchbyID(id);
				break;
				
			case 4: 
				System.out.println("Enter the name to be searched");
				String name=sc.next();
				StudentService.searchbyName(name);
				break;
				
			case 5:
				System.out.println("Enter the id of student for GPA calculation");
				id=sc.nextInt();
				StudentService.calculateGPA(id);
				break;
				
			}
			
		}while(choice!=6);
	}

}
