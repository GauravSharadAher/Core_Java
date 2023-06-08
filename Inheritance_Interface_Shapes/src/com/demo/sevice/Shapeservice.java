package com.demo.sevice;

import com.demo.beans.Shapes;
import com.demo.beans.Triangle;
import com.demo.beans.Rectangle;
import com.demo.beans.Circle;
import java.util.Scanner;

public class Shapeservice {
	
	
	private static Shapes []sarr;
	private static int count;
	
	 static {
		 sarr=new Shapes[20];
		 count=0;
	 }

	public static void addshape() {
		Scanner sc= new Scanner(System.in);
		int choice;
		System.out.println("Enter choice \n1.Triangle \n2.Rectangle  \n3.Circle");
		choice=sc.nextInt();
		System.out.println("Enter the color");
		String color=sc.next();
		
		if(choice==1) {
			System.out.println("Enter the base");
			int b= sc.nextInt();
			System.out.println("Enter the height");
			int h= sc.nextInt();
			System.out.println("Enter the s1");
			int s1= sc.nextInt();
			System.out.println("Enter the s2");
			int s2= sc.nextInt();
			Triangle t= new Triangle(color, b, h, s1,s2);
			sarr[count++]=t;
		}
		else if(choice==2) {
			System.out.println("Enter the base");
			int b= sc.nextInt();
			System.out.println("Enter the height");
			int h= sc.nextInt();
			Rectangle r= new Rectangle(color,b,h);
			sarr[count++]=r;
		}
		else {
			System.out.println("Enter the radius");
			int r= sc.nextInt();
			Circle c=new Circle(color, r);
		    sarr[count++]=c;
		}
	}

	public static void display() {
		for(int i=0; i<count; i++) {
			System.out.println(sarr[i]);
		}
		
	}

	public static String calculate() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id to be searched");
		int id=sc.nextInt();
		
		for(int i=0; i<count; i++) {
			if(sarr[i].getId()==id) {
			float area=sarr[i].calculateArea();
			float perimeter=sarr[i].calculatePerimeter();
			return (area +"  "+ perimeter);
			}
		}
		return null;
	}

	public static String calNo() {
		 int tcnt=0;
		 int rcnt=0;
		 int ccnt=0;
		 for(int i=0; i<count; i++) {
			 if(sarr[i] instanceof Triangle)
				 tcnt++;
			 else if(sarr[i] instanceof Rectangle)
				 rcnt++;
			 else
				 ccnt++;
		 }
		return "No of traingles "+tcnt+" No of Rectangles "+rcnt+" No of Circles "+ccnt;
	}
	

}
