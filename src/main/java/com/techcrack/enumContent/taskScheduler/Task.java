package com.techcrack.enumContent.taskScheduler;

public class Task {
    private final int id;
    private final String description;

    private final TaskType taskType;
    private final TaskPriority taskPriority;
    private TaskStatus taskStatus;

    public Task(int id, String description, TaskType taskType, TaskPriority taskPriority, TaskStatus taskStatus) {
        this.id = id;
        this.description = description;
        this.taskType = taskType;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    @Override
    public String toString() {
        return "Task \n{ " +
                "\ndescription = '" + description + '\'' +
                "\nid = " + id +
                "\ntaskType = " + taskType +
                "\ntaskPriority = " + taskPriority +
                "\ntaskStatus = " + taskStatus +
                "\n}";
    }
}
