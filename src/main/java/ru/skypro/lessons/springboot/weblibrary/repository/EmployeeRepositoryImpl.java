package ru.skypro.lessons.springboot.weblibrary.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    // Коллекция для имитации данных
    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));


    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    @Override
    public int getEmployeeCount() {
        return employeeList.size();
    }
    @Override
    public int getEmployeeSalaryMax() {
        return 10;
    }
    @Override
    public int getEmployeeSalaryMin() {
        return 2;
    }

    @Override
    public int getEmployeeSalarySum() {
        return 12;
    }

    @Override
    public int getEmployeeSalaryHingSalary() {
        return 8;
    }
}
