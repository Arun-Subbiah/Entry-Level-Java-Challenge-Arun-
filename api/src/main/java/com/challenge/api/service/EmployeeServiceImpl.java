package com.challenge.api.service;

import com.challenge.api.model.Employee;
import java.util.*;
import org.springframework.stereotype.Service;

/**
 * Implementation of EmployeeService for in-memory management of Employee objects.
 * Uses a mock persistence layer using a HashMap.
 * Employees are stored by UUID. New employees are automatically assigned a random UUID.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    // In Memory Database, Keyed by UUID
    private final Map<UUID, Employee> employeeStore = new HashMap<UUID, Employee>();

    /**
     * Retrieves all employees from the in-memory store
     * @return a {@link List} containing all {@link Employee} objects
     */
    @Override
    public List<Employee> getAllEmployees() {

        return new ArrayList<>(employeeStore.values());
    }

    /**
     * Retrieves a single employee by UUID.
     * @param uuid the UUID of the employee to retrieve
     * @return the {@link Employee} object if found, or {@code null} if not found
     */
    @Override
    public Employee getEmployeeByUuid(UUID uuid) {
        return employeeStore.get(uuid);
    }

    /**
     * Creates a new employee and adds it to the in-memory store.
     * Assigns a randomly generated UUID to the new employee.
     * @param employeeData the {@link Employee} object containing data to store
     * @return the newly created {@link Employee} object with assigned UUID
     */
    @Override
    public Employee createEmployee(Employee requestBody) {

        UUID uuid = UUID.randomUUID();
        requestBody.setUuid(uuid);
        employeeStore.put(uuid, requestBody);
        return requestBody;
    }
}
