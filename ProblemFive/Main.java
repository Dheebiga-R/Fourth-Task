package com.TaskFour.ProblemFive;

//creating a main class
public class Main {
    public static void main(String[] args) throws StackOverFlow {
        //creating an object
        StackInteger stack = new StackInteger();

        //add data into stack
        stack.pushdata(25);
        stack.pushdata(15);
        stack.pushdata(55);
        stack.pushdata(35);
        stack.pushdata(75);
        System.out.println("Before removing an element from stack::");
        if(stack.isempty()){  //check stack is empy or not
            System.out.println("Stack is empty");
        }
        else System.out.println("Stack is not empty");

        System.out.println("Elements in stack are::");
        for(int i=0;i<stack.size();i++){  //print the data's contain in stack
            System.out.println(stack.getdata(i));
        }
        //remove data from stack
        stack.popdata();
        stack.popdata();
        stack.popdata();
        stack.popdata();
        stack.popdata();

        System.out.println("After removing element from stack::");
        if(stack.isempty()){  //check stack after removing all data's
            System.out.println("Stack is empty");
        }
        else System.out.println("Stack is not empty");

    }
}
