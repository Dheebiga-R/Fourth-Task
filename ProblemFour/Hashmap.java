package com.TaskFour.ProblemFour;

//creating a custom hashmap
public class Hashmap {

    //data members
    private String name;
    private int grades;
    private Hashmap[] arr;
    private static int CAPACITY=10;  //initial capacity of hashmap is 10
    private int size=0;

    public Hashmap(){  //default constructor
        this.arr=new Hashmap[CAPACITY];  //hashmap array of size 10
    }
    public Hashmap(String name,int grades){  //parametrized constructor
        this.name=name;
        this.grades=grades;
    }

    //add method
    public void add(String name,int grades){
        if(size==CAPACITY){                              //size of the hashmap reaches the initial capacity
            CAPACITY = 2*CAPACITY;                       //doubles the capacity
            Hashmap[] temp = new Hashmap[CAPACITY];      //creating temporary hashmap of array size which doubles the initial capacity
            for(int i=0;i<arr.length;i++){
                temp[i] = arr[i];                        //copy every element in arr to temp
            }
            arr = temp;                                  //after completely copy temp array to arr
        }
        arr[size++] = new Hashmap(name,grades);          //add elements in an array
    }

    //remove method
    public void remove(String name){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].name.equals(name)){                //if any name in array matches the given name
                index =i;                                //get the index of that name
                break;
            }
        }
        if(index!=-1) {                                   //if name is present in array
            for (int i = index; i < arr.length-1; i++) {  //start index value of name and shift the elements
                arr[i] = arr[i+1];
            }
        }
        size--;                                           //after removing element decrease the size
    }

    //length method to return number of student
    public int length(){
        return size;
    }

    //get method -- return the student detail
    public String get(int position){
        return "Name:" +arr[position].name +" Grade:"+arr[position].grades;
    }

    //display method
    public void display(){
        System.out.print("Array{ ");
        for(int i=0;i<size;i++){
            System.out.print("Name:" +arr[i].name + " Grade:" + arr[i].grades + "  ");
        }
        System.out.println("}");
    }
}
