package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;
import com.challenge.api.model.Employee;

/**
 * Class represents employee in the system.
 * Implements Employee interface
 * Provides getter and setter methods for each attribute.
 */

public class EmployeeImpl implements Employee {

    // Unique identifier for the employee
    private UUID uuid;

    //Personal Details
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;

    //Job Details
    private String jobTitle;
    private String email;

    //Contract Details
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    //Getters and Setters
    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName( String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Instant getContractHireDate() {
        return contractHireDate;
    }

    @Override
    public void setContractHireDate(Instant hireDate) {
        this.contractHireDate = hireDate;
    }

    @Override
    public Instant getContractTerminationDate() {
        return contractTerminationDate;
    }

    @Override
    public void setContractTerminationDate(Instant terminationDate) {
        this.contractTerminationDate = terminationDate;
    }


}