package com.techcrack.InterfaceConcept;

import java.time.LocalDate;
import java.time.LocalTime;

/*
       * This class is used to manipulate the Contractor salary;
       * calculateSalary() -> Method Calculate the salary of the Contractor based on his working hours.
       * startWork() -> method activates as true which indicates the Contractor has been active now.
       * endWork() -> This method Deactivate as false which indicates the Contractor has been inactive now.
       * generateReport() -> Generates report about the Contractor.
       * checkEmployeeActive() -> Method checks the Contractor is active or not.
       * updateHourlyRate() -> Updates the hourly rate of the Contractor.
       * updateHourlyWorked() -> Updates the worked hour of Contractor.
 */
public class Contractor implements Payable, Reportable, Workable{

    // Paying amount for each hour for a Contractor.
    private double hourlyRate = 1000.00;

    // Hours worked by the Contractor.
    private double hoursWorked = 0.0;

    // Stores the Contractor is active or not.
    private boolean active = false;

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

    // Parameterized Constructor to initialize the instances state.
    public Contractor(double hourlyRate, double hoursWorked, String name, int employeeId, double annualSalary, String department, String position,  boolean workingCurrently ) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.employeeId = employeeId;
        this.annualSalary = annualSalary;
        this.department = department;
        this.position = position;
        setHireDate();
        setStartTime();
        this.workingCurrently = workingCurrently;

    }

    // @return returns name of the Contractor.
    public String getName() {
        return name;
    }

    // @param Update the name of the Contractor.
    public void setName(String name) {
        this.name = name;
    }

    // @return returns the employeeId.
    public int getEmployeeId() {
        return employeeId;
    }

    // @param update the Contractor employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // @return returns the annual salary of the employee.
    public double getAnnualSalary() {
        return annualSalary;
    }

    // @param Update the annual salary of the Contractor.
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // @return returns the name of the department.
    public String getDepartment() {
        return department;
    }

    // @param update the Contractor department.
    public void setDepartment(String department) {
        this.department = department;
    }

    // @return return the current position of the Contractor.
    public String getPosition() {
        return position;
    }

    // @param update the Contractor position.
    public void setPosition(String position) {
        this.position = position;
    }

    // @return Hired date
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Update the hired date.
    public void setHireDate() {
        this.hireDate = LocalDate.now();
    }

    // @return tru if Contractor Currently working here.
    public boolean isWorkingCurrently() {
        return workingCurrently;
    }

    // @param updating the current working status
    public void setWorkingCurrently(boolean workingCurrently) {
        this.workingCurrently = workingCurrently;
    }

    // @return work started time.
    public LocalTime getStartTime() {
        return startTime;
    }

    // update the work started time
    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    // @return return the end time.
    public LocalTime getEndTime() {
        return endTime;
    }

    // Update the end Time
    public void setEndTime() {
        this.endTime = LocalTime.now();
    }

    // Override the method from the Payable interface.
    // Generates salary based on the hours worked.
    // @return returning the salary.
    @Override
    public double calculateSalary() {

        // Checking the Contractor has valid working hours.
        if (validateSign(hoursWorked))
            // returning the salary.
            return hourlyRate * hoursWorked;
        return 0.0;
    }

    // Override the method from Workable Interface.
    // Activating the Contractor is active now.
    @Override
    public void startWork() {
        // Activating
        this.active = true;

        // Indicating the message to the user.
        System.out.println("You Are Active and It will be Stored");
    }

    // Override the method from Workable Interface.
    // Deactivating the Contractor is inactive now.
    @Override
    public void endWork() {

        // Deactivating
        this.active = false;

        // Indicating the message to the user.
        System.out.println("You Are Session Has been Ended");
    }

    // Override the method from the Reportable interface.
    // Generates a report about the Contractor.
    @Override
    public void generateReport() {
        // Checking the user status
        checkEmployeeActive();
        // Printing the salary.
        System.out.println("Contractor Salary is : " + calculateSalary());

        // Generating the slip.
        Payable.generateSlip(this);

        // Getting the report about the Contractor.
        sendReport();

        System.out.println(this);

    }

    // @param new Hours Rate.
    // Updating the hours of the contractor.
    public void updateHourlyRate(double hourlyRate) {

        if (hourlyRate < 0.0)
            throw new IllegalArgumentException("Invalid Hourly Rate ...");

        // Adding new hourly rate to already exist rate.
        this.hourlyRate += hourlyRate;
    }

    // @param New Worked hours.
    // Updating the working hours of the Contractor.
    public void updateWorkedHours(double hoursWorked) {
        // Checking the Given working hours are valid.
        if (hoursWorked < 0.0)
            // Throwing Exception In case of invalid working hours.
            throw new IllegalArgumentException("Invalid Working Hours...");
        // Updating working hours with new working hours.
        this.hoursWorked += hoursWorked;
    }

    // This method is used to know is the Contractor is active or not.
    public void checkEmployeeActive() {
        // Checking the contractor based on the active variable.
        if (active)
            System.out.println("Contractor is active Now....");
        // If condition fails indicating the Contractor is inactive now.
        else
            System.out.println("Contractor is not active Now....");
    }

    /*
        * It Overrides the method from Object Class
        * It will print the object attributes.
     */

    @Override
    public String toString() {
        return "Contractor\n{ " +
                "" +
                "\nhourlyRate = " + hourlyRate +
                "\nhoursWorked = " + hoursWorked +
                "\nactive = " + active +
                "\nname = " + name +
                "\nemployeeId = " + employeeId +
                "\nannualSalary = " + annualSalary +
                "\ndepartment = " + department +
                "\nposition = " + position +
                "\nhireDate = " + hireDate +
                "\nworkingCurrently = " + workingCurrently +
                "\nstartTime = " + startTime +
                "\nendTime = " + endTime +
                "\n}";
    }
}