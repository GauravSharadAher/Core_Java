package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Display all\n 3. Disaly by id\n 4. Display by name");
		System.out.println("5. sort by sal\n 6. sort by name\n 7. modify sal\n 8. delete by id\n 9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			es.addEmpl();
			break;
		case 2:
			Set<Employee> dis =es.displayAll();
			if(dis!=null) {
				dis.forEach(e->{System.out.println(e);});
			}else {
				System.out.println("No data Present");
			}
			break;
		case 3:
			System.out.println("Enter id :");
			int id= sc.nextInt();
			Employee em =es.displayById(id);
			if(em!=null) {
				System.out.println(em);
			}else {
				System.out.println("No data Present");
			}
			break;
		case 4:
			System.out.println("Enter name :");
			String nm=sc.next();
			Set<Employee>disnm=es.displayByName(nm);
			if(disnm!=null) {
				disnm.forEach(e->{System.out.println(e);});
			}else {
				System.out.println("No data Present");
			}
			break;
		case 5:
			Set<Employee> srtsal=es.sortBySal();
			if(srtsal!=null) {
				srtsal.forEach(e->{System.out.println(e);});
			}else {
				System.out.println("No data Present");
			}
			break;
		case 6:
			Set<Employee> srtnm =es.sortByName();
			if(srtnm!=null) {
				srtnm.forEach(e->{System.out.println(e);});
			}else {
				System.out.println("No data Present");
			}
			break;
		case 7:
			System.out.println("Enter id :");
			id=sc.nextInt();
			System.out.println("Enter  new salary :");
			double sal=sc.nextDouble();
			boolean result=es.modifysal(id,sal);
			if(result) {
				System.out.println("Salary modified");
			}else {
				System.out.println("Employee Not found");
			}
			break;
		case 8:
			System.out.println("Enter id :");
			id=sc.nextInt();
			result=es.deleteById(id);
			if(result) {
				System.out.println();
				System.out.println("Employee Deleted Successfully");
			}else {
				System.out.println("Employee Not found");
			}
			break;
		case 9:
			sc.close();
			System.out.println("Exit");
			break;
		}
		}while(choice!=9);
	}
}
