package com.challenge.api.service;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;

/**
 *Service Interface for managing employee data
 * Defines operations for retrieving all employees, retrieving a single employee by UUID,
 * and creating a new employee.
 */
public interface EmployeeService {

    /**
     * Retrieves all employees from the system.
     * @return a List of all Employee objects
     */
    List<Employee> getAllEmployees();

    /**
     * Retrieves a single employee by their UUID.
     * @param uuid the UUID of the employee
     * @return the Employee object if found, or null if not found
     */
    Employee getEmployeeByUuid(UUID uuid);

    /**
     * Creates a new employee in the system.
     * The UUID of the employee will be automatically assigned by the implementation.
     * @param employee, the object containing data to create
     * @return the newly created Employee with an assigned UUID
     */
    Employee createEmployee(Employee requestBody);
}
