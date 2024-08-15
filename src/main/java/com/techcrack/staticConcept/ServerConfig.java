package com.techcrack.staticConcept;

// This method responsible to initialize the static block demonstration.
// It Has a field serverAddress which will store the serverAddress using static block

public class ServerConfig {
    // Storing the server address
    private final static String serverAddress;

    // Static block to initialize the server address during the class loads
    static {
        serverAddress = "192.168.1.1";
        System.out.println("Static block loaded");
    }

    // Retrieving the server address
    // @return a string type of server address.

    public static String getServerAddress() {
        return serverAddress;
    }

    // Demonstrating it
    public static void main(String[] args) {
        // Retrieving the server address.
       // System.out.println(ServerConfig.getServerAddress());
    }
}
