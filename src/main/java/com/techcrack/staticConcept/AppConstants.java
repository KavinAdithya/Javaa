package com.techcrack.staticConcept;

/*
    This Class is responsible for Demonstrating the static methods, static variables, and static blocks.
    This Class is responsible for providing Application name, version and max_users.
    The Instance Variables are encapsulated.
    getAppName() -> returns the name of the application
    getAppVersion() -> returns the current version of the application.
    getMaxUsers() -> returns the applications maximum users can handle it.
 */
public class AppConstants {

    // Class variable which holds application name
    private final static String APP_NAME;

    // Class Variable which holds the current version of the application
    private final static double VERSION;

    // Class variable users can be handled by the application

    private final static int MAX_USERS;

    // static block to initialize the class variable during the class load
    static{
        APP_NAME = "Tech Universe";
        VERSION = 5.3;
        MAX_USERS = 1_00_000;

        // System.out.println("Class has Been Loaded");
    }

    // @return It will return the application name.
    public static String getAppName() {
        return APP_NAME;
    }

    // @return It will return the version of the application
    public static double getVersion() {
        return VERSION;
    }

    // @return It will return the application maximum users can be used
    public static int getMaxUsers() {
        return MAX_USERS;
    }

    // Driver mode for demonstrating it
    public static void main(String[] args) { 

        System.out.println(AppConstants.getAppName());
        System.out.println(AppConstants.getMaxUsers());
        System.out.println(AppConstants.getVersion());
    }
}