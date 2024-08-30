package com.techcrack.enumContent;
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
public class Days {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        System.out.println(day);

        switch (day) {
            default:
                System.out.println("Its a Sunday");
                break;
            case MONDAY:
                System.out.println("Its a Monday");
                break;
            case TUESDAY:
                System.out.println("Its a Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Its a Wednesday");
                break;
            case THURSDAY:
                System.out.println("Its a Thursday");
                break;
            case FRIDAY :
                System.out.println("Its a friday");
                break;
            case SATURDAY:
                System.out.println("Its a Saturday");
                break;


        }
    }
}
