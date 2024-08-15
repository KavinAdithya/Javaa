package com.techcrack.staticConcept;

// This Method is responsible for managing the configuration
// DATABASE_URL -> stores the database url
// API_KEY -> Stores the API key
// MAX_CONNECTIONS -> maximum connections allowed to connect the database
public class ConfigManager {
    // DataBase url
    private static final String DATABASE_URL;

    // API_KEY storing
    private static final String API_KEY;

    // Maximum connections allowed to connect the database
    private static final int MAX_CONNECTIONS;


    // Static block for initializing
    static {
        DATABASE_URL = "localhost:mysql//JDBC";
        API_KEY = "Dramatic";
        MAX_CONNECTIONS = 90;
    }

    // @return return the database url
    public static String getDatabaseUrl() {
        return DATABASE_URL;
    }

    // @return return the API key
    public static String getApiKey() {
        return API_KEY;
    }

    // @return return the maximum connections allowed to connect the database
    public static int getMaxConnections() {
        return MAX_CONNECTIONS;
    }

    // Driver Method
    public static void main(String[] args) {
        System.out.println("DataBase URl : " + ConfigManager.getDatabaseUrl());
        System.out.println("API KEy : " + ConfigManager.getApiKey());
        System.out.println("Maximum Connections allowed : " + ConfigManager.getMaxConnections());
    }
}
