package com.techcrack.enumContent;

public enum Week {

    SUNDAY(10000.0), 
    MONDAY(20000.00), 
    TUESDAY(30000.00),
    WEDNESDAY(40000.00),
    THURSDAY(50000.00),
    FRIDAY(60000.00),
    SATURDAY(70000.00);

    double salary = 0.0;

    private Week(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary : " + salary;
    }

    public static void main(String[] args) {
        Week day = Week.SATURDAY;
        
        Week[] days = Week.values();
    

        for (Week week : days)
            System.out.println(week);

        System.out.println(day);
    }
    
}
