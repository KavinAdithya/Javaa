package com.techcrack.InterfaceConcept;

public interface Reportable {
    void generateReport();

    default void sendReport() {
        System.out.println("The Performance of the Employee is too good. " +
                "\n But The workers put more effect which increases potential.");
    }

}
