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

        String angle = ap == 1 ? "Perimeter" : "area";

        boolean incorrectShape = false;

        double value = switch(sides) {
            case 3 -> triangle(ap);
            case 4 -> squareOrRectangle(ap);
            case 5 -> pentagon(ap);
            case 6 -> hexagon(ap);
            case 8 -> octagon(ap);
            default -> {
                System.out.println("Invalid Shape Try again!!!");
                incorrectShape = true;
                yield 0.0;
            }

        };


        if (incorrectShape)
            return;

        System.out.println("Shape You chosen is " + shape + "\n"  + angle + " of a " + shape + " is " + value);
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

    private static double pentagon(int ap) {

        shape = "Pentagon";

        System.out.print("Enter the length of the side : ");
        int side = scanner.nextInt();

        return ap == 1 ? 5 * side : 1.720 * side * side;
    }


    private static double hexagon(int ap) {
        shape = "Hexagon";

        System.out.print("Enter the length of the side : ");
        int side = scanner.nextInt();

        return ap == 1 ? 6 * side : 1.155 * side * side;
    }


    private static double octagon(int ap) {
        shape = "Octagon";

        System.out.print("Enter the length of the side : ");
        int side = scanner.nextInt();

        return ap == 1 ? 8 * side : 4.828 * side * side;
    }


    // Driver code
    public static void main(String[] args) {
        findShape();
    }
}
