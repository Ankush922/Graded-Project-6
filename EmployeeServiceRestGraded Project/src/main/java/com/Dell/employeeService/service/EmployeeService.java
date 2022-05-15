package com.Dell.employeeService.service;

import java.util.List;

import com.Dell.employeeService.entity.Employee;
import com.Dell.employeeService.entity.Role;
import com.Dell.employeeService.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchByFirstName(String firstName);
	
	public List<Employee> sortByFirstName(String order);
	
	public User saveUser(User user);
	public Role saveRole(Role role);
}
