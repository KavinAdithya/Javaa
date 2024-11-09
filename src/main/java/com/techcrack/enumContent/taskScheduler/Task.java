package com.techcrack.enumContent.taskScheduler;

public class Task {
    private final int id;
    private final String description;

    private final TaskType taskType;
    private final TaskPriority taskPriority;
    private TaskStatus taskStatus;

    public Task(int id, String description, TaskType taskType, TaskPriority taskPriority) {
        this.id = id;
        this.description = description;
        this.taskType = taskType;
        this.taskPriority = taskPriority;
    }
}
