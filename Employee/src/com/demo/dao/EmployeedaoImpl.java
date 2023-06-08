package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.comparator.Myname;

public class EmployeedaoImpl implements Employeedao {
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(1,"Rajan","game designer",88888));
		elist.add(new Employee(2,"revati","ux designer",99999));
		elist.add(new Employee(3,"Rajan","Analyst",7777));
	}


	@Override
	public void save(Employee e) {
		elist.add(e);
	}


	@Override
	public List<Employee> display() {
		if(elist.size()!=0) {
			return elist;
		}
		return null;
	}


	@Override
	public List<Employee> findByName(String nm) {
		List<Employee> namelst =new ArrayList<>();
		for(Employee e:elist) {
			if(e.getEname().equals(nm)) {
				namelst.add(e);
			}
		}
		if(namelst.size()!=0) {
			return namelst;
		}
		return null;
	}


	@Override
	public Employee findById(int id) {
		Employee e=new Employee(id);
		System.out.println(id);
		int pos=elist.indexOf(e);
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
		
	}


	@Override
	public List<Employee> sortBySalary() {
		List<Employee> st = new ArrayList<>();
		for(Employee e:elist) {
			st.add(e);
		}
		st.sort(null);
		return st;
	}


	@Override
	public boolean modifySalById(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteById(int id) {
//	      Employee e=findById(id);
	      elist.remove(id);
	      return true;
	}


	@Override
	public List<Employee> sortByName() {
		List<Employee> ls= new ArrayList<>();
		for(Employee e:elist) {
			ls.add(e);
		}
		ls.sort(new Myname());
	    
		return ls;
	}


	
		
	}


