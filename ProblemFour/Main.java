package com.TaskFour.ProblemFour;

import java.util.Scanner;

//Main class
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //creating an object
        Hashmap hashmap = new Hashmap();

        //add elements in hashmap
        hashmap.add("kavin",66);
        hashmap.add("karan",88);
        hashmap.add("Meenu",92);
        hashmap.add("Santhosh",89);
        hashmap.add("vicky",95);
        hashmap.add("vennila",91);
        hashmap.add("ramesh",72);
        hashmap.add("leela",77);

        //remove elements
        hashmap.remove("kavin");
        hashmap.remove("Meenu");
        hashmap.remove("Santhosh");
        hashmap.remove("leela");

        //display elements in hashmap
        hashmap.display();

        System.out.println("Number of students is ::" + hashmap.length());  //Return number of students in hashmap
        System.out.println("Enter the position to see the student name and grade::");
        int position = input.nextInt();
        if(position<=hashmap.length()){
            System.out.println(hashmap.get(position-1));   //print the details of student
        }
        else System.out.println("Please enter proper position!");

    }
}
