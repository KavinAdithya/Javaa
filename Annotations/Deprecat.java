
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Deprecat {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old Method");
    }

    public static void main(String[] args) {
        // new Deprecat().oldMethod(); // Anonymous object

        String[] lan = new String[5];

        final List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);

        lan[0] = "Java Programing";

        final int c = 10;
        InnerDeprecat innerDeprecat =  (c1) -> System.out.println(Arrays.toString(lan));

        innerDeprecat.test(11);
        // lan = new String[6];
        
        // num = null;
        num.add(10);

        lan[0] = "Java Spring";

        innerDeprecat.test(11);
    }
}

@FunctionalInterface
interface InnerDeprecat {
    void test(int n);
} 