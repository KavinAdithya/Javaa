package com.techcrack.collectionFramework;

import java.util.*;

class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person { Name : " + name + " Age : " + age;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        Person person = (Person) o;
        return this.age == person.age && Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age, name);
    }
}
public class HashCode {
    public static void main(String[] args) {
        Person person = new Person(19, "James");
        Person person1 = new Person(9, "James");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person);

        System.out.println(personSet);
        System.out.println(person1.equals(person));

    }
}
