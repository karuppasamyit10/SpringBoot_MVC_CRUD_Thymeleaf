/**
 * 
 */
package com.crudapp.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.dao.EmployeeDao;
import com.crudapp.entity.Employee;
import com.crudapp.repository.EmployeeRepository;

/**
 * @author Karuppu
 * @created on Nov 15, 2016
 * Spring-Boot-MongoDb-CRUD
 */
@Transactional
@Service
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		Employee employeeObj=null;
		try {
//			employeeObj = employeeRepository.findByEmployeeId(employee.getEmployeeId());
			employeeObj = employeeRepository.save(employee);
		} catch (Exception e) {
		}
		return employeeObj;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		List<Employee> employeeObj=null;
		try {
			employeeObj = employeeRepository.findAll();
		} catch (Exception e) {
		}
		return employeeObj;
	}
	
	@Override
	public List<Employee> getEmployee(String search) throws Exception {
		List<Employee> employeeObj=null;
		try {
			employeeObj = employeeRepository.findByFirstNameContainingOrLastNameContainingOrLanguageContainingOrDepartmentContaining(search, search, search, search);
		} catch (Exception e) {
		}
		return employeeObj;
	}
	
	@Override
	public void deleteEmployee(int employeeId) throws Exception {
		try {
				employeeRepository.delete(employeeId);
		} catch (Exception e) {
		}
	}
	
	@Override
	public Employee editEmployee(int employeeId) throws Exception {
		Employee employeeObj=null;
		try {
			employeeObj=employeeRepository.findByEmployeeId(employeeId);
		} catch (Exception e) {
		}
		return employeeObj;
	}
}
