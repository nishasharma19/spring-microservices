package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired

	private EmployeeRepository employeeRepo;

	

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}



	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		 employeeRepo.save(employee);
	}
	
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepo.findById(theId);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theEmployee;
	}



	@Override
	public void deleteById(int theId) {
		employeeRepo.deleteById(theId);
		
	}



	@Override
	public List<Employee> searchBy(String theFirstName, String theLastName) {
		// TODO Auto-generated method stub
		return employeeRepo.
				findByFirstNameContainsAndLastNameContainsAllIgnoreCase(
						theFirstName, theLastName);	
	}

}
