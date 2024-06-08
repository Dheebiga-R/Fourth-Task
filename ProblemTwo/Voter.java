package com.TaskFour.ProblemTwo;

//creating a class voter
public class Voter{

    //data members
    private int voterId;
    private String name;
    private int age;
    //this data is used to verify user eligible or not
    int flag=0;

    public Voter() {  //default constructor
        this.voterId = 0;
        this.name = "";
        this.age = 0;
    }

    public Voter(int voterId, String name, int age) throws InvalidVoter {  //parametrized constructor with try catch block
        this.voterId = voterId;
        this.name = name;
        this.age = age;
        try {
            flag++;
            if (this.age < 18) {
                throw new InvalidVoter("Invalid age for vote");
            }
        }
        catch(InvalidVoter e){
            System.out.println(e.getClass() + " /" +e.getMessage());  //get the class/package name and message
        }
    }

    @Override  //override the default tostring method
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
