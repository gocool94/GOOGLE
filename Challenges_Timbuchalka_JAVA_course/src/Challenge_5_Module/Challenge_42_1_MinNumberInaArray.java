package Challenge_5_Module;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_42_1_MinNumberInaArray {



    /*
-Write a method called readIntegers() with a parameter called count
that represents how many integers the user needs to enter.[DONE]

-The method needs to read from the console until all
the numbers are entered, and then return an array containing the numbers entered.
[DONE]

-Write a method findMin() with the array as a parameter.
The method needs to return the minimum value in the array.

-In the main() method read the count from the console and
call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array
returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef

     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the count --");
        int count = scanner.nextInt();
        scanner.nextLine();


        int[] ReturnedArray = readIntegers(count);

        int ReturnedMin = findMin(ReturnedArray);

        System.out.println("Min :- "+ ReturnedMin);
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0;i<count;i++){
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;

    }

    private static int findMin(int[] array){

         int Minvalue = array[0];
        System.out.println(Arrays.toString(array));
         for (int i = 0;i<array.length;i++){
             if (Minvalue>array[i]){
                 Minvalue = array[i];
             }
         }
        System.out.println("Minimum value is " +Minvalue);
         return Minvalue;
    }
}
