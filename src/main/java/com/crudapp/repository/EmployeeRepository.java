/**
 * 
 */
package com.crudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.entity.Employee;


/**
 * @author Karuppu
 * @created on Nov 15, 2016
 * Spring-Boot-MongoDb-CRUD
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	/**
	 * @param search
	 * @param search2
	 * @param search3
	 * @param search4
	 * @return
	 */
	List<Employee> findByFirstNameContainingOrLastNameContainingOrLanguageContainingOrDepartmentContaining(String search, String search2, String search3, String search4);

	Employee findByEmployeeId(int employeeId);
	
}
