package com.challenge.api.service;
import org.springframework.stereotype.Service;
import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import java.time.Instant;
import java.util.*;

/**
 * Implementation of EmployeeService for in-memory management of Employee objects.
 * Uses a mock persistence layer using a HashMap.
 * Employees are stored by UUID. New employees are automatically assigned a random UUID.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<UUID, Employee> employeeStore = new HashMap<>();  // In Memory Database

    //Returns list of all employees in store
    @Override
    public List<Employee> getAllEmployees() {

        return new ArrayList<>(employeeStore.values());

    }

    //Returns single employee by uuid
    @Override
    public Employee getEmployeeByUuid(UUID uuid) {
        return employeeStore.get(uuid);

    }

    //Creates new employee in store and assigns uuid
    @Override
    public Employee createEmployee(Employee requestBody) {

        UUID uuid = UUID.randomUUID();
        requestBody.setUuid(uuid);
        employeeStore.put(uuid,requestBody);
        return requestBody;

    }

}
