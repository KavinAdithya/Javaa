package com.techcrack.Generics;

import java.util.Arrays;
import java.util.List;

// This class is used to Demonstrate the calculation of the average of integers
public class UpperBoundCalculation {
    // @param list of elements used to calculate the average of the list.
    // The List type is wildcard type allows us to accept any type allows us to read-only
    // Ensures type safety.
    // @return the average salary of the employee
    static double calculateAverageSalary(List<? extends Number> list) {

        // Handling the dge case
        if (list == null || list.isEmpty())
            return 0.0;

        // Used to store the total salary
        double sum = 0.0;

        // Iterating the month salary and calculating the salary
        for (Number number : list)
            sum += number.doubleValue();

        // Dividing the total salary by the number of months
        return sum / list.size();
    }

    // Driver method to demonstrate it
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(10000, 23445, 2334545, 908887);
        List<Double> listOfDouble = Arrays.asList(12894.90, 547839.90, 537940.90, 35374.678);

        System.out.printf("Average Salary of the Integer is : %d\n" , (int) calculateAverageSalary(listOfInteger));
       // System.out.printf("Average Salary of the double is : %.2f " , calculateAverageSalary(listOfDouble));
    }
}
