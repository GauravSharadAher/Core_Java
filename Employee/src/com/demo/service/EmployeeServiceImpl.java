package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.Employeedao;
import com.demo.dao.EmployeedaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	public static int count;
	static{
		count=4;
	}
	Employeedao edao=new EmployeedaoImpl();
	     Scanner sc=new Scanner(System.in);
	@Override
	public void addEmployee() {
		
		
		int id=count++;
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter the Designation");
		String post=sc.next();
		System.out.println("Enter the salary");
		double sal=sc.nextDouble();
		
		Employee e= new Employee();
		edao.save(e);
	}

	@Override
	public void displayAll() {
		List<Employee> elistdis;
		elistdis=edao.display();
		
		if(elistdis.size()!=0) {
			for(Employee e:elistdis) {
				System.out.println(e);
			}
		}
			else {
				System.out.println("Data not present");
			}
		}

	@Override
	public List<Employee> searchByName() {
		System.out.println("Enter name to be searched");
		String nm=sc.next();
		return edao.findByName(nm);
	}

	@Override
	public Employee searchById() {
		System.out.println("Enter id to be searched");
		int id=sc.nextInt();
		return edao.findById(id);
		
	}

	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortBySalary();
	}

	@Override
	public boolean modifySal() {
	    System.out.println("Enter the id of Employee");
	    int id=sc.nextInt();
	    System.out.println("Enter the updated salary");
	    double sal= sc.nextDouble();
	    return edao.modifySalById(id,sal);
	}

	@Override
	public boolean deleteEmp() {
		System.out.println("Enter the id of Employee to be deleted");
		int id=sc.nextInt();
		Employee e=edao.findById(id);
		if(e!=null) {
			System.out.println("Employee to be deleted"+e.getEmpid()+"  "+e.getEname());
			System.out.println("Do you really want to delete Emp"+"  To delete enter yes otherwise no ");
			String comm=sc.next();
			if(comm.equals("yes")) {
				edao.deleteById(id);
			}
		}
		return false;
	}

	@Override
	public List<Employee> SortEmpByName() {
		
		return edao.sortByName();
	}



	


	
}
