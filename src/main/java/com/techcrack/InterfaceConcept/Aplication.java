package com.techcrack.InterfaceConcept;

public class Aplication {

    public static void main(String[] args) {
        Contractor contractor = new Contractor();

        contractor.startWork();
        contractor.checkEmployeeActive();
        contractor.updateHourlyRate(5);
        contractor.updateWorkedHours(90);
        System.out.println(contractor.calculateSalary());

        contractor.generateReport();


        ((Payable) contractor).calculateSalary();
        ((Reportable) contractor).generateReport();
        ((Workable)  contractor).startWork();
        ((Workable) contractor).endWork();

    }
}
