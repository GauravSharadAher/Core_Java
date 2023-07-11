package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static Set<Employee> eset;
	static 
	{
		eset= new HashSet<>();
		eset.add(new Employee(1,"Gaurav",15000,"Developer"));
		eset.add(new Employee(2,"Andy",10000," Sr Developer"));
		eset.add(new Employee(3,"Tejas",90000,"Manager"));
	}
	@Override
	public void save(Employee e) {
		eset.add(e);
	}
	@Override
	public Set<Employee> display() {
		return eset;
	}
	@Override
	public Employee showInfoById(int id) {
		for(Employee e:eset) {
			if(e.getEmpid()==id) {
				return e;
			}
		}
		return null;
		
	}
	@Override
	public Set<Employee> displayByNaam(String nm) {
		Set<Employee> disnm =eset.stream().filter(ob->ob.getEname().equals(nm)).collect(Collectors.toSet());
		if(disnm.size()>0) {
			return disnm;
		}
		return null;
	}
	@Override
	public Set<Employee> sortBysalary() {
		Set<Employee> srtsal=new TreeSet<>();
		for(Employee e:eset) {
			srtsal.add(e);
			}
		return srtsal;
		}
	@Override
	public Set<Employee> sortByNm() {
	
		Comparator<Employee> c =(o1,o2)->{return o1.getEname().compareTo(o2.getEname());};
		Set<Employee> disnm= new TreeSet<>(c);
		for(Employee e :eset) {
			disnm.add(e);
		}
		return disnm;
	}
	@Override
	public boolean modifysalary(int id, double sal) {
		Scanner sc= new Scanner(System.in);
		Employee e = showInfoById(id);
		if(e!=null) {
			e.setSalary(sal);
			return true;
			}
		return false;
		}
	@Override
	public boolean deleById(int id) {
		Scanner sc= new Scanner(System.in);
		Employee e = showInfoById(id);
		if(e!=null) {
			System.out.println("Are You sure want to delete Employee" +" Name : "  +e.getEname() + " Id :"+ e.getEmpid());
			System.out.println("If yes press :y");
			System.out.println("Choice :");
			System.out.println();
			String ip= sc.next();
			if(ip.equals("y")) {
				eset.remove(e);
				return true;
			}
		}
		return false;
	}
}
