
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


@RepeatAuthor(value = {@Repeat(author = "James"), @Repeat(author = "Gosling")})
public class Tester {



    public static void main(String[] args) {
        Class<?> clazz = B.class;
        Method[] methods = clazz.getDeclaredMethods();
        Field[] fields = clazz.getDeclaredFields();
        Constructor[] onConstructors = clazz.getConstructors();
    

        for (Method m : methods)
            System.out.println(m.getName());

        if (clazz.isAnnotationPresent(RepeatAuthor.class)) {
            System.out.println("Verified");
            for (Repeat r : clazz.getAnnotation(RepeatAuthor.class).value()) {
                System.out.println(r.author());
            }
        }

    }

    static void dot(){

    }

    void run() {

    }
}

class B extends Tester {

}
