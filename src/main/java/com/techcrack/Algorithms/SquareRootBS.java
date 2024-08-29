

public class SquareRootBS {
    public static void main(String[] args) {
    //    double d = 25.00;

    //    System.out.println("Square Root Of " + d + " is " + squareRoot(d));
   

        int x = 0;

        for (int i = 0; i < 5; i++) {
            x = x++ + --x + (x = 5);
            
        }

        System.out.println(x);
    }

    static double squareRoot(double target) {
        double start = 1;
        double end = target / 2;
        double precision = 0.000_000_000_000_001;
        double mid = 0.0;

        while (start < end) {
            mid = (start + end) / 2.0;

            double value = mid * mid;

            if (Math.abs(target - value) <= precision)
                return mid;
            else if (value < target)
                start = mid;
            else
                end = mid;
        }

        return mid;
    }
}