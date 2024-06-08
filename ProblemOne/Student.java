package com.TaskFour.ProblemOne;

//creating a class student
public class Student {

    //data members
    private int rollno;
    private String name;
    private int age;
    private String course;

    Student(){  //default constructor
        this.rollno=0;
        this.name="";
        this.age=0;
        this.course="";
    }

    Student(int rollno,String name,int age,String course){  //parametrized constructor
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.course=course;
    }

    //getter and setter method for those private data members
    //Here i use only getter method for my use

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

}
