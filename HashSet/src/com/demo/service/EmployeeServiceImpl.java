package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao  edao;
	
	public EmployeeServiceImpl() {
		super();
		this.edao= new EmployeeDaoImpl();
	}

	@Override
	public void addEmpl() {
		Scanner sc=new Scanner(System.in);
		//accept data for employee
		System.out.println("enter empid");
		int empid=sc.nextInt();
		System.out.println("enter ename");
		String nm=sc.next();
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter Salary");
		double s=sc.nextDouble();
		//create employee object
		Employee e=new Employee(empid,nm,s,desg);
		//add data in the elist using dao layer
		edao.save(e);
		
	}

	@Override
	public Set<Employee> displayAll() {
	
		return edao.display();
		
	}
	@Override
	public Employee displayById(int id) {
		return edao.showInfoById(id);
	}

	@Override
	public Set<Employee> displayByName(String nm) {
		return edao.displayByNaam(nm);
	}

	@Override
	public Set<Employee> sortBySal() {
		return edao.sortBysalary();
	}

	@Override
	public Set<Employee> sortByName() {
		return edao.sortByNm();
		
	}

	@Override
	public boolean modifysal(int id,double sal) {
		return edao.modifysalary(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.deleById(id);
	}

}
