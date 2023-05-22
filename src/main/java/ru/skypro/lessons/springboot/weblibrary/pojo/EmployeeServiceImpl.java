package ru.skypro.lessons.springboot.weblibrary.pojo;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.pojo.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
