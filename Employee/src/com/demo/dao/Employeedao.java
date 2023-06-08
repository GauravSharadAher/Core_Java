package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface Employeedao {

	void save(Employee e);

	List<Employee> display();

	List<Employee> findByName(String nm);

	Employee findById(int id);

	List<Employee> sortBySalary();

	boolean modifySalById(int id, double sal);

	boolean deleteById(int id);

	List<Employee> sortByName();


}
