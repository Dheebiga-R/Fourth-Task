package com.TaskFour.ProblemOne;

//class for NameNotValidException which is a child class of exception
public class NameNotValidException extends Exception{

    public NameNotValidException(String message) {
        super(message);                             //message passed by NameNotValidException is again passes to its parent class Exception
    }
}
