package com.TaskFour.ProblemTwo;

import java.util.Scanner;

//Main class
public class Main {
    public static void main(String[] args) throws InvalidVoter {

        //scanner resource
        Scanner input = new Scanner(System.in);

        //ask the user to enter details
        System.out.println("Enter your details like voter ID,name and age::");
        Voter voter = new Voter(input.nextInt(),input.next(),input.nextInt());

        //if voter is eligible for vote this information is display for user
        if(voter.flag==0){
            System.out.println("You are eligible for vote!!");
        }
        System.out.println();
        System.out.println(voter.toString());    //print the details that user enters
        System.out.println("Your information is stored Successfully!!");

    }
}
