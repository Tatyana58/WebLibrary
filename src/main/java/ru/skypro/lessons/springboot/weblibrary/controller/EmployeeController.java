package ru.skypro.lessons.springboot.weblibrary.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
//@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/count")
    public int getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }

    @GetMapping("/salary/max")
    public int getEmployeeSalaryMax() {
        return employeeService.getEmployeeSalaryMax();
    }

    @GetMapping("/salary/min")
    public int getEmployeeSalaryMin() {
        return employeeService.getEmployeeSalaryMin();
    }

    @GetMapping("/salary/sum")
    public int getEmployeeSalarySum() {
        return employeeService.getEmployeeSalarySum();
    }
    @GetMapping("/high")
    public int getEmployeeSalaryHingSalary() {
        return employeeService.getEmployeeSalaryHingSalary();
    }

}
