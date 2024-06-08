package com.TaskFour.ProblemOne;

//class for AgeNotWithinRangeException which is a child class of exception
public class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException(String message) {
            super(message);                              //message passed by AgeNotWithinRangeException is again passes to its parent class Exception
    }
}
