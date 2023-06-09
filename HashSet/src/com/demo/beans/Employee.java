package com.demo.beans;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String ename;
	private double salary;
	private String desg;
	
	public Employee() {
		super();
	}

	
	
	@Override
	public int hashCode() {
		return empid;
	}

	@Override
	public boolean equals(Object obj) {
		return empid==((Employee)obj).empid;
	}
	
	public Employee(int empid, String ename, double salary, String desg) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.desg = desg;
	}
	
	
	

	public Employee(int empid, double salary) {
		super();
		this.empid = empid;
		this.ename = null;
		this.salary = salary;
		this.desg = null;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", desg=" + desg + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return (int) (this.salary-o.salary);
	}
	
	
	
	
	

}
