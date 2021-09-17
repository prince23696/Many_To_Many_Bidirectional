package com.Many_to_Many.Many_to_Many_Bidirectional.Controller;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Employee;
import com.Many_to_Many.Many_to_Many_Bidirectional.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmployee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/saveEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted form database id-" + id;
    }

    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
        return employee;
    }
}
