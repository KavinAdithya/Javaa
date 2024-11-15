package com.techcrack.enumContent.taskScheduler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public enum TaskScheduler {
    TASK_SCHEDULER;

    private List<Task> taskLists = new ArrayList<>();

    public void addTask(Task task) {
        taskLists.add(task);
    }

    private void sortByPriorityAndType() {

        if (taskLists.isEmpty())
            return;

        Comparator<Task> comparator = (o1, o2) -> {
            if (o1.getTaskPriority().getSeverityScore() != o2.getTaskPriority().getSeverityScore()) {
                return o1.getTaskPriority().getSeverityScore() - o2.getTaskPriority().getSeverityScore();
            }

            return o1.getTaskType().ordinal() - o2.getTaskType().ordinal();
        };

        taskLists.sort(comparator);
    }

    public void updateStatus(int id, TaskStatus taskStatus) {

        if (id < 0 || taskStatus == null || taskLists.isEmpty()) {
            System.out.println("Failed To update status !!!");
            return;
        }

        for (Task task : taskLists) {
            if (task.getId() == id) {
                task.setTaskStatus(taskStatus);
                System.out.println("Task Status Updated Successfully....");
                return;
            }
        }

        System.out.println("Status Updated Successfully...");
    }

    public void groupByStatus() {
        List<Task> NEW = new ArrayList<>();
        List<Task> IN_PROGRESS = new ArrayList<>();
        List<Task> COMPLETED = new ArrayList<>();
        List<Task> BLOCKED = new ArrayList<>();

        for (Task task : taskLists) {
            switch (task.getTaskStatus()) {
                case NEW -> NEW.add(task);
                case IN_PROGRESS -> IN_PROGRESS.add(task);
                case COMPLETED -> COMPLETED.add(task);
                default -> BLOCKED.add(task);
            }
        }

        printStatus(NEW, TaskStatus.NEW);
        printStatus(IN_PROGRESS, TaskStatus.IN_PROGRESS);
        printStatus(COMPLETED, TaskStatus.COMPLETED);
        printStatus(BLOCKED, TaskStatus.BLOCKED);
    }

    private void printStatus(List<Task> tasks, TaskStatus taskStatus) {
        if (tasks.isEmpty()) {
            System.out.println(taskStatus + " Is Empty...");
            return;
        }

        System.out.println("List of " + taskStatus + " are : ");

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void printTasksBaseOnPriorityAndStatus() {
        this.sortByPriorityAndType();

        for (Task task : taskLists) {
            System.out.println(task);
        }
    }
}
