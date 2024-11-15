package com.techcrack.enumContent.taskScheduler;

public class TaskDriver {
    public static void main(String[] args) {
        Task task1 = new Task(1, "Task 1", TaskType.DEVELOPMENT, TaskPriority.CRITICAL, TaskStatus.NEW);
        Task task2 = new Task(2, "Task 2", TaskType.TESTING, TaskPriority.HIGH, TaskStatus.IN_PROGRESS);
        Task task3 = new Task(3, "Task 3", TaskType.DEPLOYMENT, TaskPriority.MEDIUM, TaskStatus.COMPLETED);
        Task task4 = new Task(4, "Task 4", TaskType.MAINTENANCE, TaskPriority.LOW, TaskStatus.BLOCKED);

        TaskScheduler taskScheduler =  TaskScheduler.TASK_SCHEDULER;

        taskScheduler.addTask(task1);
        taskScheduler.addTask(task2);
        taskScheduler.addTask(task3);
        taskScheduler.addTask(task4);

        taskScheduler.printTasksBaseOnPriorityAndStatus();
        taskScheduler.groupByStatus();
        taskScheduler.updateStatus(1, TaskStatus.COMPLETED);
        taskScheduler.groupByStatus();
    }
}
