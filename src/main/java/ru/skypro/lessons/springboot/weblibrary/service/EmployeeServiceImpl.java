package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public int getEmployeeCount() {
        return employeeRepository.getEmployeeCount();
    }

    @Override
    public int getEmployeeSalaryMax() {
        return employeeRepository.getEmployeeSalaryMax();
    }
    @Override
    public int getEmployeeSalaryMin() {
        return employeeRepository.getEmployeeSalaryMin();
    }
    @Override
    public int getEmployeeSalarySum() {
        return employeeRepository.getEmployeeSalarySum();
    }
    @Override
    public int getEmployeeSalaryHingSalary() {
        return employeeRepository.getEmployeeSalaryHingSalary();
    }


}
