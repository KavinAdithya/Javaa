package com.techcrack.enumContent.taskScheduler;

public enum TaskType {

    DEVELOPMENT("Application is being developing...", 2000.20),
    TESTING("Application is in Testing...", 100.09),
    MAINTENANCE("Application is in Maintenance...", 500.79),
    DEPLOYMENT("Application is in Deploying...", 300.00);

    public final String description;
    public final double hour;

    TaskType(String description, double hour) {
        this.description = description;
        this.hour = hour;
    }

    public void executeTask() {
        System.out.println(description + " it will took around " + hour + "hrs to complete this task...");
    }

}
