package com.techcrack.enumContent;

import java.util.Scanner;

public class Java12Switch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(java12());
    }


    static String java12() {
        var days = 5;                                            ;

        String day = switch(days) {
            
            case 0 -> {
                System.out.println("Its A Week End Second day"); 
                yield "Sunday";
            }
            
            case 1 -> "Monday";
            
            case 2 -> "Tuesday";
            
            case 3 -> "Wednesday";
            
            case 4 -> "Thursday";
            
            case 5 -> "Friday";
            
            default -> {
                System.out.println("Its A Week End of First day");
                yield "Saturday";
            }
        };
    

        return day;
    }
    
}
