package com.techcrack.InterfaceConcept;

public class Contractor implements Payable, Reportable, Workable{

    private double hourlyRate = 1000.00;
    private double hoursWorked = 0.0;
    @Override
    public double calculateSalary() {
        //if (validateSalary())
        return 0.0;
    }

    @Override
    public void startWork() {

    }

    @Override
    public void endWork() {

    }

    @Override
    public void generateReport() {

    }

    public void updateHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}