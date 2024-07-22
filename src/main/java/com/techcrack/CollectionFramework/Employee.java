package com.techcrack.CollectionFramework;

import java.lang.Comparable;
import java.util.*;

/*
    * Class is used to hold employee details and perform basic operation.
    * I'd be used to identifying the employee uniquely.
    * Name it is the name of the employee.
    * Salary it is an amount that the employee gets.
    * Implement the comparable interface to implement the natural ordering.
 */
public class Employee implements Comparable<Employee> {
    private int id;

    private String name;
    private double salary;

    // Parameterized Constructor used to initialize during the object creation.
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Retrieving id
    public int getId() {
        return id;
    }

    // updating id
    public void setId(int id) {
        this.id = id;
    }

    // Retrieving employee name
    public String getName() {
        return name;
    }

    // updating employee name
    public void setName(String name) {
        this.name = name;
    }

    // Retrieving the employee salary
    public double getSalary() {
        return salary;
    }

    // Updating the employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Implementing the natural ordering of employees
    @Override
    public int compareTo(Employee employee) {
        if (this.id > employee.id)
            return 1;
        else if (this.id == employee.id)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Driver method for this class
    public static void main(String[] args){

        // Creating our own ordering of the objects
        Comparator<Employee> employeeComparator = (a, b) -> b.id - a.id;

        // Creating a list to manage the employees
        List<Employee> set = new ArrayList<>();

        // Creating Objects
        Employee employee = new Employee(1, "Kavin", 110000.0);
        Employee employee1 = new Employee(2, "Dharani", 200001010.00);

        // Adding objects to list
        set.add(employee);
        set.add(employee1);

        // Printing the list
        System.out.println(set);

        set.sort(employeeComparator);

        System.out.println(set);
    }
}
