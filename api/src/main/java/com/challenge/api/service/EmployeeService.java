package com.challenge.api.service;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;

/**
 *Service Interface for managing employee data
*/
public interface EmployeeService {

    List<Employee> getAllEmployees(); // retrieve all employees
    Employee getEmployeeByUuid(UUID uuid); // retrieve single employee by uuid
    Employee createEmployee(Employee requestBody); // create new employee

}