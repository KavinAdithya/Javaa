package com.techcrack.enumContent.taskScheduler;

public enum TaskPriority {
    LOW(4),
    MEDIUM(3),
    HIGH(2),
    CRITICAL(1);

    private final int severityScore;

    TaskPriority(int severityScore) {
        this.severityScore = severityScore;
    }

    public int getSeverityScore() {
        return severityScore;
    }
}
