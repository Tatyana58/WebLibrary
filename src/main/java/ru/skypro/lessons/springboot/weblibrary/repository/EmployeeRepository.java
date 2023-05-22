package ru.skypro.lessons.springboot.weblibrary.repository;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    int getEmployeeCount();

    int getEmployeeSalaryMax();
    int getEmployeeSalaryMin();
    int getEmployeeSalarySum();
    int getEmployeeHingSalary();
}
