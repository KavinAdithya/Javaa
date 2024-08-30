package com.techcrack.enumContent;


import java.util.Scanner;
public class Shapes {

    public void findShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of sides : ");
        int sides = scanner.nextInt();

        String shape = null;
        boolean area = false;

        System.out.print("Do You want to calculate ( area / perimeter ) : ");
        String operation = scanner.next().toLowerCase();

        double value = switch(sides) {
            case 3 -> {
                shape = "Triangle";

                yield switch (operation) {
                    case "perimeter" -> {
                        System.out.print("Enter the Sides : ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        int c = scanner.nextInt();

                        yield a + b + c;
                    }
                    default -> {
                        System.out.print("Enter the breadth and height : ");
                        int breadth = scanner.nextInt();
                        int height = scanner.nextInt();
                        yield  breadth * height / 2.0;
                    }
                };
            }


        };
    }
}
