package Student;

import java.util.Scanner;

public class StudentService {
	public static Student []sarr;
	public static int count;
	
	static {
		sarr=new Student[10];
		count=0;
	}
	
   public static void addStudent() {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the id");
	   int id= sc.nextInt();
	   System.out.println("Enter Student name");
	   String sname=sc.next();
	   System.out.println("Enter marks for m1, m2, m3");
	   int m1=sc.nextInt();
	   int m2=sc.nextInt();
	   int m3= sc.nextInt();
	   
	   sarr[count++]=new Student(id,sname,m1,m2,m3);
   }
   
   public static void display() {
	   for(int i=0; i<count; i++) {
		   System.out.println(sarr[i]);
	   }
   }

   public static int searchbyID(int id) {
	for(int i=0; i<count; i++) {
		if(sarr[i].getSid()==id) {
			System.out.println(sarr[i]);
			return i;
		}
	}
	System.out.println("Student not found");
	return -1;
   }

   public static void searchbyName(String name) {
	
	   for(int i=0; i<count; i++) {
		   if(sarr[i].getSname().equals(name)) {
			   System.out.println(sarr[i]);
			   return;
		   }   
	   }
	   System.out.println("Student not found");
   }

public static void calculateGPA(int id) {
	int ind=searchbyID(id);
	
	float grade=(sarr[ind].getM1()+sarr[ind].getM2()+sarr[ind].getM3())/3;
	
	System.out.println("");
	
}


   
   
}
