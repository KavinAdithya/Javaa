package com.techcrack.ZohoQuestions;

public class VersionNumbers {
    public static void main(String[] args) {
        String s1 = "1.1";
        String s2 = "1.0";

        System.out.println("Version is : " + version(s1, s2));
    }

    static int version(String version1, String version2){
        String[] versionRevision1 = version1.split("\\.");
        String[] versionRevision2 = version2.split("\\.");
        int length = Math.max(versionRevision1.length, versionRevision2.length);

        for(int i = 0; i < length; i++) {
            if (i == versionRevision1.length)
                return 1;
            else if (i == versionRevision2.length)
                return -1;
            else if (Integer.parseInt(versionRevision1[i]) < Integer.parseInt(versionRevision2[i]))
                return -1;
            else if (Integer.parseInt(versionRevision1[i] ) > Integer.parseInt(versionRevision2[i]))
                return 1;
        }

        return 0;
    }
}
