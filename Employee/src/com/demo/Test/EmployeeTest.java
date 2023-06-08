package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		EmployeeService es= new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("\n1.Add employee \n2.Display all \n3.Search by name \n4.Search by id "
					+ "\n5.Sort by sal \n6.Sort by name \n7. Modify salary \n8.Delete Employee \n9.Exit\nChoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.addEmployee();
				break;
				
			case 2:
				es.displayAll();
				break;
			case 3:
				List<Employee>elists=es.searchByName();;
				if(elists!=null) {
					elists.forEach((e)->{
						System.out.println(e);});
				}
				else {
					System.out.println("Data not found");
				}
				break;
				
			case 4:
				
				Employee  obid=es.searchById();
				if(obid!=null)
					System.out.println(obid);
				else 
					System.out.println("Data not found");
				break;
			case 5:List<Employee> ls=es.sortBySal();
				ls.forEach((e)->{
					System.out.println(e);
				});
				break;
				
			case 6:
				ls=es.SortEmpByName();
				if(ls!=null) {
					ls.forEach((e)->{
						System.out.println(e);
					});
				}
				else {System.out.println("Data not found");}
				break;
				
			case 7:
				 boolean flag=es.modifySal();
				 if(flag)
					 System.out.println("Salary updated successfully");
				 else
					 System.out.println("Employee not found");
				break;
			case 8:
				flag=es.deleteEmp();
				break;
				
			case 9:
				break;
			}
		}while(choice!=9);
		
	}

}
