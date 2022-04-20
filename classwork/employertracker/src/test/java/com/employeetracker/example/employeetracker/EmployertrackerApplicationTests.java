package com.employeetracker.example.employeetracker;

import com.employeetracker.example.employeetracker.models.Employee;
import com.employeetracker.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployertrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee adam = new Employee("Adam", 32, "930303", "adamwhite@email.com" );
		Employee james = new Employee("James", 23, "990933", "james@email.com");
		employeeRepository.save(adam);
		employeeRepository.save(james);
	}

}
