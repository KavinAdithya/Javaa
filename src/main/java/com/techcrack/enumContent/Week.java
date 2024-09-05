package com.techcrack.enumContent;

public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        Week day = Week.MONDAY;

        String name = "Kavin";

        switch (day) {
            case MONDAY -> System.out.println("Its Monday " + name + " !!!");
            case TUESDAY -> System.out.println("Its a Tuesday " + name + " !!!");
            case WEDNESDAY -> System.out.println("Its a Wednesday " + name + " !!!");
            case THURSDAY -> System.out.println("Its a Thursday " + name + " !!!");
            case FRIDAY -> System.out.println("Its a Friday " + name + " !!!");
            case SATURDAY -> System.out.println("Its a Saturday " + name + " !!!");
            default -> System.out.println("Its a Monday " + name + " !!!");
        }

    }
}
