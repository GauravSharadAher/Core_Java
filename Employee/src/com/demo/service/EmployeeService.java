package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.Employeedao;
import com.demo.dao.EmployeedaoImpl;

public interface EmployeeService {
    
	
	void addEmployee();

	void displayAll();

	List<Employee> searchByName();

	Employee searchById();

	List<Employee> sortBySal();

	boolean modifySal();

	boolean deleteEmp();

	List<Employee> SortEmpByName();


}
