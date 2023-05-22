package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int getEmployeeCount();
    int getEmployeeSalaryMax();
    int getEmployeeSalaryMin();
    int getEmployeeSalarySum();
    int getEmployeeSalaryHingSalary();

}
