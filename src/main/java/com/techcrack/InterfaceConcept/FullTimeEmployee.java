package com.techcrack.InterfaceConcept;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * This class is responsible for holding and manipulating the full time employees.
 *
 */
public class FullTimeEmployee implements Payable, Reportable, Workable{

    // Name of the employee
    private String name;

    // Employee ID
    private int employeeId;

    // Annual Salary of the employee
    private double annualSalary;

    // Department of the employee
    private String department;

    // Position of the employee
    private String position;

    // Employee Hired date.
    private LocalDate hireDate;

    // Is Currently employee working or not?
    private boolean workingCurrently;

    // Employee Joined Time
    private LocalTime startTime;

    // Employee leaving time
    private LocalTime endTime;

    // Hourly pay for the employee.
    private double hourlyPay;

    // Working Hours of the employee.
    private double workHours;

    // Parameterized Constructor for initializing the instance state during Object creation.
    public FullTimeEmployee(String name, int employeeId, double annualSalary, String department, String position,  boolean workingCurrently, double hourlyPay, double workHours) {
        this.name = name;
        this.employeeId = employeeId;
        this.annualSalary = annualSalary;
        this.department = department;
        this.position = position;
        this.workingCurrently = workingCurrently;
        this.hourlyPay = hourlyPay;
        this.workHours = workHours;

        // Setting the initial time of the employee during object creation;
        startWork();
    }

    // @return returns the name of the employee.
    public String getName() {
        return name;
    }

    // @param Update the employee name
    public void setName(String name) {

        // Checking the given name is valid or not.
        if (name == null)
            throw  new IllegalArgumentException("Invalid Name !!!");
        // Assigning the new name.
        this.name = name;
    }

    // @return Retrieving the employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Updating the employee id
    public void setEmployeeId(int employeeId) {
        // Checking the new employee id is valid or not.
        if (employeeId < 1)
            throw new IllegalArgumentException("Invalid Employee Id !!!");

        this.employeeId = employeeId;
    }

    // @return returns the annual salary of the employee.
    public double getAnnualSalary() {
        return annualSalary;
    }

    // @param Updating the employee annual salary.
    public void setAnnualSalary(double annualSalary) {

        // Checking the annual Salary is non-negative.
        if (annualSalary < 0.0)
            throw new IllegalArgumentException("Invalid Annual Salary !!!");

        this.annualSalary = annualSalary;
    }

    // @return retrieving the department of the employee.
    public String getDepartment() {
        return department;
    }

    // @param Updating the employee department.
    public void setDepartment(String department) {

        // Checking the given department is not null.
        if (department == null)
            throw new IllegalArgumentException("Invalid Department !!!");

        this.department = department;
    }

    // @return the position of the Employee.
    public String getPosition() {
        return position;
    }

    // @param Updating the employee position.
    public void setPosition(String position) {

        // Checking the new position is not null.
        if (position == null)
            throw new IllegalArgumentException("Invalid Position !!!");

        this.position = position;
    }

    // @return the hired date.
    public LocalDate getHireDate() {
        return hireDate;
    }

    // @param update the hired date.
    public void setHireDate() {
        this.hireDate = LocalDate.now();
    }

    // @return return boolean as employee is still working here or not.
    public boolean isWorkingCurrently() {
        return workingCurrently;
    }

    // @param update the status of working.
    public void setWorkingCurrently(boolean workingCurrently) {
        this.workingCurrently = workingCurrently;
    }

    // @return the worked hours.
    public double getWorkHours() {
        return workHours;
    }

    // @param set worked newly.
    public void setWorkHours(double workHours) {
        this.workHours += workHours;
    }

    // @return return the amount paid for each hour working.
    public double getHourlyPay() {
        return hourlyPay;
    }

    // @param Update newly hourly pay
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay += hourlyPay;
    }

    // Overrides the method from Payable interface.
    // This method is responsible for calculating the salary of the employee based on hours worked.
    // @return returns the salary of the employee.
    @Override
    public double calculateSalary() {
        // Checking the working hours are valid or not.
        if (validateSign(workHours))
            return hourlyPay * workHours;
        return 0.0;
    }

    // Generates a report about the employee.
    // Overrides from reportable interface.
    @Override
    public void generateReport() {
        // Invoking the default method from reportable interface.
        sendReport();
        // generating slip based on the current object.
        Payable.generateSlip(this);

        // Printing the current object.
        System.out.println(this);

    }

    // @Override the method from workable interface.
    // Sets the time of employee joined.
    @Override
    public void startWork() {
        this.startTime = LocalTime.now();
    }

    // Override the method from the workable interface.
    // Stores the time employee leaves the company.
    @Override
    public void endWork() {
        this.endTime = LocalTime.now();
    }

    // Override the method from Object class.
    // Printing the instances state when the object is printed.
    @Override
    public String toString() {
        return "FullTimeEmployee\n{" +
                "\n\tname = '" + name + '\'' +
                "\n\temployeeId = " + employeeId +
                "\n\tannualSalary = " + annualSalary +
                "\n\tdepartment = '" + department + '\'' +
                "\n\tposition = '" + position + '\'' +
                "\n\thireDate = " + hireDate +
                "\n\tworkingCurrently = " + workingCurrently +
                "\n\tstartTime = " + startTime +
                "\n\tendTime = " + endTime +
                "\n\thourlyPay = " + hourlyPay +
                "\n\tworkHours = " + workHours +
                "\n}";
    }
}
