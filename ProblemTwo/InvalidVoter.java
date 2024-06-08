package com.TaskFour.ProblemTwo;

//Invalid voter extends exception class
public class InvalidVoter extends Exception{

    public InvalidVoter(String message){
        super(message);  //pass the message to the exception class
    }
}
