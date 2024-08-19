package com.techcrack.InterfaceConcept;

public class Aplication {

    public static void main(String[] args) {
//        Contractor contractor = new Contractor();
//
//        contractor.startWork();
//        contractor.checkEmployeeActive();
//        contractor.updateHourlyRate(5);
//        contractor.updateWorkedHours(90);
//        System.out.println(contractor.calculateSalary());
//
//        contractor.generateReport();
//
//
//        ((Payable) contractor).calculateSalary();
//        ((Reportable) contractor).generateReport();
//        ((Workable)  contractor).startWork();
//        ((Workable) contractor).endWork();

//        int x = 0;
//
//        for (int i = 0; i < 5; i++) {
//            x = x++;
//            System.out.println(x++);
//        }
//
//        System.out.println(x);

        Contractor contractor = new Contractor(100.00, 20.5, "Kavin", 43, 1000000.00, "Software Developer", "Manager of software", true);

        contractor.generateReport();

    }
}
