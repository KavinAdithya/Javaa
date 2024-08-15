package com.techcrack.generics;

import java.util.ArrayList;
import java.util.Collection;

public class Casting {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        if (a instanceof ArrayList<String>)
            System.out.println("true Its");

        Collection<String> aa = (Collection<String>) a;

    }

}
