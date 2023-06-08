package com.demo.test;
import java.util.Scanner;

import com.demo.sevice.Shapeservice;

public class TestShapes {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=-1;
		
		do {
			System.out.println("1.Add Shape  \n2.Display all \n3.Calculate area and perimter \n4.No of shapes \n5.Exit");
	        choice=sc.nextInt();
	        
	        switch(choice) {
	        case 1:
	        	Shapeservice.addshape();
	        	break;
	        	
	        case 2:
	        	Shapeservice.display();
	        	break;
	        	
	        case 3:
	        	String data=Shapeservice.calculate();
	        	if(data!=null) {
	        		System.out.println("Area and perimter "+data);
	        	}
	        	else
	        		System.out.println("ID not found");
	        case 4:
	        	  System.out.println(Shapeservice.calNo());
	        	break;
	        case 5:
	        	sc.close();
	        	System.out.println("Thank you for visiting....");
	        	break;
	        default:
	        	System.out.println("Invalid choice");
	        	break;
	        }
		
		}while(choice!=5);
	}
}
