package com.demo.beans;

public class Employee implements Comparable<Employee> {
	
	private int empid;
	private String ename,post;
	private double sal;
	
	
	
	
	public Employee() {
	      
	}
	
	public Employee(int empid, String ename, String post, double sal) {
		
		this.empid = empid;
		this.ename = ename;
		this.post = post;
		this.sal = sal;
	}
	public Employee(int empid) {
		
		this.empid = empid;
		this.ename = null;
		this.post = null;
		this.sal = 0;
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	//super sub method same sign
	//overriden oveload sign 
	public boolean equals(Object ob) {
		System.out.println(this.getEmpid()+"   "+((Employee)ob).getEmpid());
		return this.getEmpid()==((Employee)ob).getEmpid();
	}
//override sign
//	public boolean equals(Employee e) {
//		System.out.println(this.getEmpid()+"   "+e.getEmpid());
//		return this.getEmpid()==e.getEmpid();
//	}

	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", post=" + post + ", sal=" + sal + "]";
	}

@Override
		public int compareTo(Employee o) {
	
	return (int) (this.getSal()-o.getSal());
	}
	
	
	

}
