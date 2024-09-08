package com.techcrack.enumContent;

public class Time {

    private static String findMaximumTime(String time) {
        char[] timeArray = time.toCharArray();

        if (timeArray[4] == '?')
            timeArray[4] = '9';
        if (timeArray[3] == '?')
            timeArray[3] = '5';
        
        if ( ( timeArray[0] == '?' && timeArray[1] == '?') || (timeArray[0] == '?' && timeArray[1] - '0' < 4))
            timeArray[0] = '2';
        
        if (timeArray[0] == '?')
            timeArray[0] = '1';
        
        if (timeArray[1] == '?' && timeArray[0] == '2')
            timeArray[1] = '3';

        if (timeArray[1] == '?' && timeArray[0] - '0' < 2)
            timeArray[1] = '9';

        return new String(timeArray);
    }

    public static void main(String[] args) {
        String time = findMaximumTime("?4:5?");
        
        System.out.println(time);
    }
    
}
