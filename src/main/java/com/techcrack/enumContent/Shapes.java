package com.techcrack.enumContent;


import java.util.Scanner;
public class Shapes {
    static Scanner scanner = new Scanner(System.in);

    static   String shape = null;
    public static void findShape() {


        System.out.print("Enter the Number of sides : ");
        int sides = scanner.nextInt();


        boolean area = false;

        System.out.print("Do You want to calculate ( area / perimeter ) : ");
        String operation = scanner.next().toLowerCase();

        int ap = operation.equals("area") ? - 1 : 1;

        double value = switch(sides) {
            case 3 -> triangle(ap);
            case 4 -> squareOrRectangle(ap);
            case 5 -> 0.0;
            default -> 0.0;

        };
    }


    private static double triangle(int ap) {
        shape = "Triangle";
        return switch (ap) {
            case 1 -> {
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


    private static double squareOrRectangle(int ap) {
        System.out.print("I was Confused and I have a doubt ? Could You Help me ?? (yes / no) : ");
        String command = scanner.next().toLowerCase();

        if ( !command.equals("yes")) {
            System.out.println("I Was Confused and do know what to do now ? ");
            return  0.0;
        }
        System.out.print("Is It a Square or Rectangle (square / rectangle) : ");
        shape = scanner.next().toLowerCase();

        if (shape.equals("square")) {
            System.out.print("Enter The side : ");
            int side = scanner.nextInt();

            return ap == 1 ? 4 * side : side * side;
        }

        System.out.print("Enter the length and breadth : ");

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        return ap == 1 ? 2 * (length + breadth) : length * breadth;
    }
}
