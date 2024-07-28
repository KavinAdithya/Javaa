package com.techcrack.BasicQuestions;

public class StringBuilderMethods {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();

//        System.out.println(stringBuilder);
//
//        // 01
        stringBuilder.append("KaVin");
//        System.out.println(stringBuilder);
//
//        // 02
//        stringBuilder.insert(2, " ");
//        System.out.println(stringBuilder);
//
//        // 03
//        //stringBuilder.delete(1,3);
//        //System.out.println(stringBuilder);
//
//        // 04
//        stringBuilder.deleteCharAt(2);
//        System.out.println(stringBuilder);
//
//        // 05
//        System.out.println(stringBuilder.charAt(1));
//
//        // 06
//        stringBuilder.setCharAt(0, 'k');
//        System.out.println(stringBuilder);
//
//        // 07
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);
//
//        // 08
//        stringBuilder.replace(1,3, "KaVin");
//        System.out.println(stringBuilder);
//
//        // 09
//        System.out.println(stringBuilder.length());
//
//        // 10
//        System.out.println(stringBuilder.toString());

        // 11
        System.out.println(stringBuilder.capacity());

        // 12
        stringBuilder.ensureCapacity(19);

        System.out.println(stringBuilder.capacity());

        // 13
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());

        // 14
        System.out.println(stringBuilder.indexOf("k"));

        // 15
        System.out.println(stringBuilder.lastIndexOf("i"));

        // 16
        System.out.println(stringBuilder.codePointAt(1));

        // 17
        System.out.println(stringBuilder.substring(0,3));

        // 18
        stringBuilder.setLength(1);
        System.out.println(stringBuilder);


    }
}
