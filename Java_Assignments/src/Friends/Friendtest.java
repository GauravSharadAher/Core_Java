package Friends;

import java.util.Scanner;
//And do the following.
//1. Display All Friend
//2. Search by id
//3. Search by name
//4. Display all friend with a particular hobby
//5. Exit

public class Friendtest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("1. Add friend \n2.Display all \n3.Search by ID \n4.Search by name \5.Display by hobby \6.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				FriendService.addFriend();
			}
			
		}while(choice!=5);
	}

}
