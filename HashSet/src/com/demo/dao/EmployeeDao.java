package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> display();

	Employee showInfoById(int id);

	Set<Employee> displayByNaam(String nm);

	Set<Employee> sortBysalary();

	Set<Employee> sortByNm();

	boolean modifysalary(int id, double sal);

	boolean deleById(int id);

}
