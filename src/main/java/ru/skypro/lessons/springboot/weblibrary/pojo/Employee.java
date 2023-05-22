package ru.skypro.lessons.springboot.weblibrary.pojo;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static int compare (Employee p1, Employee p2){
        if(p1.getSalary() > p2.getSalary())
            return 1;
        return -1;
    }
}
