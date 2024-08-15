package com.techcrack.collectionFramework;


import java.util.*;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Id : " + id +  " Name : " + name + " Age : " + age;
    }
}
public class StudentManager {
    private final Collection<Student> students;

    public StudentManager(){
        students = new ArrayList<>();
    }
    public boolean add(Student student){
        return students.add(student);
    }

    public boolean remove(int id){
        students.removeIf(student -> student.id == id);
        displayStudents();
        return true;
    }

    public void displayStudents(){
        for(Student student : students)
            System.out.println(student);

    }

    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();

        studentManager.add(new Student(19, "Dharani Kavin ", 21));
        studentManager.displayStudents();
        studentManager.remove(19);
        studentManager.add(new Student(43 , " Kavin_Adithya ", 21));
        studentManager.displayStudents();
    }

}
