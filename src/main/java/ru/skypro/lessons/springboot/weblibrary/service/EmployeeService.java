package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int getEmployeeCount();
    List<Employee> getEmployeeSalaryMax();
    List<Employee> getEmployeeSalaryMin();
    int getEmployeeSalarySum();
    List<Employee> getEmployeeHingSalary();

}
