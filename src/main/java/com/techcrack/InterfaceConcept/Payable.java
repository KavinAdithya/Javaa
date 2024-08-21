package com.techcrack.InterfaceConcept;

/*
 * This interface abstracts implementation of every worker salary calculation.
 * Provides a Higher level to the user.
 */

public interface Payable {

    // Method, which calculates the salary of the employee.
    double calculateSalary();

    // It is a method that is responsible to calculate the salary and generate the slip.
    // @param A payable interface object is required based on that it will calculate the salary.

    static void generateSlip(Payable payable) {
        System.out.println("Total Salary That the Employee" +
                " aEarned for previous 5 year is " + payable.calculateSalary());
    }

    // default method to access validating signature method.
    // Which will indicate the working hours are valid or not.
    // @param hour employee worked hours
    // @return It will return true if the working hour is valid.
    // Else it will throw an IllegalArgumentException
    default boolean validateSign(double hours) {

        // Invoking the private method checking the working hours are valid.
        if (! validateSignature(hours))
            throw new IllegalArgumentException("Invalid Working Hours !!!");

        // Valid working hours
        return true;
    }

    // It is a private method that is defined in the interface.
    // @param hours -> employee worked Hours
    // Checking the given employee worked minimum according to minimum wage.
    // @return returns true if the employee working hours satisfy the minimum working hours.
    private boolean validateSignature(double hours) {
        // validating the Employees should work for 15-hour minimum.
        return hours > 15;
    }

}
