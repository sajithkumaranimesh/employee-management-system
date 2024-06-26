package edu.icet.employeecrm.service;

import edu.icet.employeecrm.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAll();

    void deleteEmployeeById(Long id);

    void updateEmployee(Employee employee);
}
