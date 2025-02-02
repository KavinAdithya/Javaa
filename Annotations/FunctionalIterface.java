

@FunctionalInterface
interface Manipulation {
    void operation();

    default void printName() {
        privateInter();
        System.out.println("Java");
    }

    static void staticMethod() {
        
        System.out.println("Static Method.Method..");
    }

    private void privateInter() {
        System.out.println("Private");
    }
}

public class FunctionalIterface {
    public static void main(String[] args) {
        Manipulation manipulation = () -> {
            System.out.println("Manipulated");
        };

        Manipulation manipulation1 = new Manipulation() {
            
            @Override
            public void operation() {
                System.out.println("Manipulated 2");
            }

            @Override
            public void printName() {
                System.out.println("Java Programming");
            }
        };


        manipulation.operation();
        manipulation.printName();
        Manipulation.staticMethod();
        manipulation1.operation();
        manipulation1.printName();
        System.out.println("Reached");
    }
}
