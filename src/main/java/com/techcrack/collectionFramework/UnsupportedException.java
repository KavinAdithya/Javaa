package com.techcrack.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnsupportedException {
    public static void main(String[] args) {
        List<Integer> list = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(1, 3, 3)));

        System.out.println(list);

        List<Integer> list1 = Arrays.asList(89,2);

        list1.add(90);
    }
}
