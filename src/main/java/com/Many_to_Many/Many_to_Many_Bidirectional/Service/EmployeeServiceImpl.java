package com.Many_to_Many.Many_to_Many_Bidirectional.Service;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Employee;
import com.Many_to_Many.Many_to_Many_Bidirectional.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Added Successfully";
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employee1 = employeeRepository.getById(id);
        employee1.setE_name(employee.getE_name());
        employee1.setProjects(employee.getProjects());
        employeeRepository.save(employee1);
        return employee1;
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Employee Deleted Successfully";
    }
}
