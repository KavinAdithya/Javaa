import java.util.Arrays;
import java.util.Scanner;

public class oddAndEvenSum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i =
        
        
        
        
        
        0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int cLength = n / 2;
        int bLength = n - cLength;

        int[] b = new int[bLength];
        int[] c = new int[cLength];

        int nums1 = 0;
        int nums2 = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b[nums1] = a[i];
                nums1++;
            }
            else {
                c[nums2] = a[i];
                nums2++;
            }
        }

        Arrays.sort(b);
        Arrays.sort(c);
        
        int max1 = b.length < 2 ? 0 : b[b.length - 2];
        int max2 = c.length < 2 ? 0 : c[c.length - 2];

        System.out.println(max1 + max2);

        scan.close();
    }
}
