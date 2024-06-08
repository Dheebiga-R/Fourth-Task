package com.TaskFour.ProblemThree;

import java.util.Scanner;
//Main class
public class Weekdays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //array of size 7 to store the name of a weekdays
        String[] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Enter the position for to get the name of weekdays::");
        int position = input.nextInt();
        try{   //if entered position is out of bound, this message is passed to Index which is child class for Exception
            if(position>=6){
                throw new Index("Index out of range");
            }
            System.out.println(weekdays[position]);
        }
        catch(Index e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
