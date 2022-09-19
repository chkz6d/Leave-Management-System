package com.leavemanagment.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagment.app.model.Employee;
import com.leavemanagment.app.repository.EmployeeRepository;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllFlight(){
		return employeeRepository.findAll();
	}
	
	//create employee rest api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		List<Employee> list = employeeRepository.findAll();
		for(Employee emp: list) {
			if(emp.getId() == employee.getId()) {
				throw new RuntimeException("EMPLOYEE IS ALREADY EXIST");
			}
		}
		return employeeRepository.save(employee);
	}
	
	//fetching employee by ID
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(!optional.isPresent())
			throw new RuntimeException("EMPLOYEE IS NOT FOUND, TRY AGAIN!~!!!@#!@#!@#!@#");
		
		Employee employee = optional.get();
		return ResponseEntity.ok(employee);
	}
	
	//Update Employee's Leave balance
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employeeDetails){
		
		//Look for the Employee ID
		Optional<Employee>optional = employeeRepository.findById(id);
		//If EmployeeID does exist proceed
		if(optional.isPresent()) {
			Employee existingEmployee = optional.get();
			//If user inputs Leave Balance greater than the stored LeaveBalance than throw exception! IF NOT then proceed with the calculation
			if(employeeDetails.getLeave() > existingEmployee.getLeave())
				throw new RuntimeException("NOT ENOUGH LEAVE BALANCE");
			//subtracting data from the input
			existingEmployee.setLeave(existingEmployee.getLeave() - employeeDetails.getLeave());
			return employeeRepository.save(existingEmployee);
		}
		throw new RuntimeException("ID is Invalid");
			
	}
		
	

	
}













