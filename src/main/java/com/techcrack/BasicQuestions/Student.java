package com.techcrack.BasicQuestions;

import java.util.Arrays;

public class Student implements Comparable<Student>{


    private int semesterMarkUpdated=0;
    private String name;
    private int age;
    private final double[] cgpa=new double[8];

    private double sgp;

    public Student(String name, int age, double sgp) {
        this.name = name;
        this.age = age;
        this.sgp = sgp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getCgpa() {
        return cgpa;
    }

    public double getSgp() {
        return sgp;
    }

    public void setSgp(double sgp) {
        this.sgp = sgp;
    }


    public void addCgpa(int n){
        if(semesterMarkUpdated==cgpa.length)
            System.out.println("All Semester Marks Has been Updated Already");
        else
            cgpa[semesterMarkUpdated++]=n;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cgpa=" + Arrays.toString(cgpa) +
                ", sgpa=" + sgp +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(o.sgp==this.sgp)
            return 0;
        return this.sgp>o.sgp?1:-1;
    }
}
