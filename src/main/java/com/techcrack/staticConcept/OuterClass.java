package com.techcrack.staticConcept;

import com.techcrack.collectionFramework.Outer;

// This class is used for practise the static classes
// It contains a nested static class
public class OuterClass {

    // Nested static class
    // display() -> method display the message
    public static class InnerStaticClass {
        // Displaying the message
        public void display() {
            System.out.println("ITs Inner Static Class");
        }
    }

    // Driver method
    public static void main(String[] args) {
        // Instating the inner static class
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

        // Invoking the display method
        innerStaticClass.display();
    }


}
