package com.techcrack.dsa;

public class Job implements Comparable<Job>{
    private int startTime;
    private int endTime;
    private int profit;

    public Job(int startTime, int endTime, int profit) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "Start Time : " + startTime + " End Time : " + endTime + " Profit : " + profit;
    }

    
    @Override
    public int compareTo(Job other) {
        return this.startTime - other.startTime;
    }
}