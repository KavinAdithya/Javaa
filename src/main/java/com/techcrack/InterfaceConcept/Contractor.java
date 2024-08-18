package com.techcrack.InterfaceConcept;

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

}