import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        int value = binarySearch(number);
        int remain = binarySearch(number - (value * value));

        System.out.println("Square Root Of " + number + " is " + value + "." + remain);
    }

    static int binarySearch(int n) {
        long start = 1;
        long end = n;
        if (n > 1)
            end = n / 2;

        while (start <= end) {
            long mid = (start + end) / 2;

            if ((mid * mid) == n)
                return (int) mid;
            else if ((mid * mid) < n)
                start = mid + 1;
            else    
                end = mid - 1;
        }

        return (int)end;

    }
    
}
