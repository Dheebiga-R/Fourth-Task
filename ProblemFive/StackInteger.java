package com.TaskFour.ProblemFive;

//creating a custom stack class StackInteger
public class StackInteger {

    //data members
    private int num;
    private int[] arr;
    private static int CAPACITY=20;  //set capacity of a stack is 20, if user enter data above 20 stack overflow will occur
    private int size=0;

    public StackInteger(){  //default constructor
        this.num=0;
        this.arr = new int[CAPACITY];
    }

    public StackInteger(int num){  //parametrized constructor
        this.num=num;
    }

    public void pushdata(int num) throws StackOverFlow{  //method to push data & also if stack contains data above capacity it will throw exception
        if(size>CAPACITY){
            throw new StackOverFlow("Stack over flow");
        }
        arr[size++] = num;
    }

    public void popdata(){  //method to remove data
        --size;
    }

    public int getdata(int position){  //method to get data
        return arr[position];
    }

    public int size(){  //method to get size of the stack
        return size;
    }

    public boolean isempty(){  //method to check the stack is empty or not
        if(size==0){
            return true;
        }
        else return false;
    }
}
