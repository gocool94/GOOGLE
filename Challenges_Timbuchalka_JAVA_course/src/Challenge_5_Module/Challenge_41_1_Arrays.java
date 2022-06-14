package Challenge_5_Module;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_41_1_Arrays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int InputNumbers = scanner.nextInt();
        int[] Array_list = getIntegers(InputNumbers);


        printArray(SortedIntegers(Array_list));

        /*
         // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
         */

    }

    public static int[] getIntegers(int Numberofvalues)

    {
        System.out.println("Enter the Values here\r : - ");
        int[] valuesOfArray = new int[Numberofvalues];
            for (int i =0;i<Numberofvalues;i++){
                valuesOfArray[i] = scanner.nextInt();
            }

            return valuesOfArray;
    }

    public static void printArray(int[] arrayToprint){
        for (int i = 0;i<arrayToprint.length;i++){
            System.out.println("The Element present at "+i+" index is "+arrayToprint[i]);
        }
    }

    public static int[] SortedIntegers(int[] arrays){
//        int[] sortedArray = new int[arrays.length];
//        for (int i = 0;i<arrays.length;i++){
//            sortedArray[i] = arrays[i];
//        }

        int[] sortedArray = Arrays.copyOf(arrays,arrays.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;

            for(int i = 0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }

        return sortedArray;
    }


}
