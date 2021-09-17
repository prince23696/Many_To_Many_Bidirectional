package com.Many_to_Many.Many_to_Many_Bidirectional.Service;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployee(int id);

    public String addEmployee(Employee employee);

    public Employee updateEmployee(int id, Employee employee);

    public String deleteEmployee(int id);
}
