package com.TaskFour.ProblemOne;

//import Scanner resource and NameNotFoundException class
import javax.naming.NameNotFoundException;
import java.util.Scanner;

//StudentManagement main method
public class StudentManagement {
    public static void main(String[] args)  {
        //Scanner resource to get the inputs from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student details -- Roll no,name,age and course::");
        int flag=0;  //usage of this variable is to intimate whether exception occur or not
        Student student = new Student(input.nextInt(), input.next(), input.nextInt(), input.next());  //getting user inputs for student object

        //try catch method for exception handling
        try {                                                               //This block check whether exception occur, if it occurs throws an object to the catch method
            if(student.getAge()<15 || student.getAge()>21 ) {                         //To check whether the age is within the range
                flag++;
                throw new AgeNotWithinRangeException("You are not valid");  //pass this message to the AgeNotWithinRangeException class
            }
            char[] n = student.getName().toCharArray();                          //create a character array to store every single character of a string
            for(char c : n){
                if(!((c>=65 && c<=90) || (c>=97 && c<=122))){                //If only the alphabets ASCII code does not occur it will throw message to NameNotFoundException
                    flag++;
                    throw new NameNotFoundException("Not a valid name!!");
                }
            }
        }
        catch (AgeNotWithinRangeException e){                                           //catch if any AgeNotWithinRangeException occurs
            System.out.println(e.getMessage());                                         //get message from the exception i.e. what we have pass in AgeNotWithinRangeException
            System.out.println("Sorry!! you are not valid for this course.Thank you");  //This is additional information for user
        }
        catch (NameNotFoundException e){                                                //catch if any NameNotFoundException occurs
            System.out.println(e.getMessage());                                         //get message from the exception i.e. what we have pass in NameNotFoundException
            System.out.println("Please, try again");                                    //This is additional information for user
        }

        if(flag==0) {                                                    //This is also additional information for user.
            System.out.println("your details are stored successfully");  //If exception not occur this message will display to user
        }

    }
}
