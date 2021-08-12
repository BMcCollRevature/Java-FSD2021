package com.brigittemccoll.Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollnumber;
    String name;
    int age;

    public Student(int rollnumber, String name, int age){
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student other) {
       if (rollnumber>other.rollnumber)
           return 1;
       else if (rollnumber< other.rollnumber)
           return -1;
       else
           return 0;
    }
}
class SortByAge implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.age >s2.age)
            return 1;
        else if(s1.age < s2.age)
            return -1;
        else
            return 0;
    }
}
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
       return s1.name.compareTo(s2.name);
    }
}
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2,"Mark",30));
        students.add(new Student(1,"Watson",50));
        students.add(new Student(3,"Stacy",20));

        System.out.println("Before Sorting...");
        for (Student student:students){
            System.out.println(student);
        }

        //Collections.sort(students);
        //Collections.sort(students, new SortByAge());
        Collections.sort(students, new SortByName());

        System.out.println("After Sorting...");
        for (Student student:students){
            System.out.println(student);
        }
    }
}
