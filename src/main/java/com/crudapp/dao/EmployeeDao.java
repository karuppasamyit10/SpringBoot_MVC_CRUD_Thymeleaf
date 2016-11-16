/**
 * 
 */
package com.crudapp.dao;

import java.util.List;

import com.crudapp.entity.Employee;

/**
 * @author Karuppu
 * @created on Nov 15, 2016
 * Spring-Boot-MongoDb-CRUD
 */
public interface EmployeeDao {

	public Employee addEmployee(Employee employee) throws Exception;
	
	public List<Employee> getEmployees() throws Exception;

	public List<Employee> getEmployee(String search) throws Exception;
	
	public void deleteEmployee(int employeeId) throws Exception;

	public Employee editEmployee(int employeeId) throws Exception;	
	
}
