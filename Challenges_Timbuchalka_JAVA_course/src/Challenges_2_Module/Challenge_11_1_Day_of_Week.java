package Challenges_2_Module;

import java.util.Scanner;

public class Challenge_11_1_Day_of_Week {

    public static void main(String[] args){
    printDayoftheWeek(1);


    }

    public static void printDayoftheWeek(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;


            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input");
                break;

        }
    }

    public static class Challenge_14_Evenodd {


        /*
        Write a method called isOdd with an int parameter and call it number.
        The method needs to return a boolean. [DONE]

    Check that number is > 0, if it is not return false. [DONE]

    If number is odd return true, otherwise  return false. [DONE]

    Write a second method called sumOdd that has 2 int parameters start and end,
    which represent a range of numbers.[DONE]

    The method should use a for loop to sum all odd numbers
    in that range including the end and return the sum.

    It should call the method isOdd to check if each number is odd.

    The parameter end needs to be greater than or equal to start and
    both start and end parameters have to be greater than 0.

    If those conditions are not satisfied return -1 from the method to indicate invalid input.

    Example input/output:

    * sumOdd(1, 100); → should return 2500
    * sumOdd(-1, 100); →  should return -1
    * sumOdd(100, 100); → should return 0
    * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
    * sumOdd(100, -100); → should return -1
    * sumOdd(100, 1000); → should return 247500


    TIP: use the remainder operator to check if the number is odd

    NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
    NOTE: Do not add a  main method to solution code.
         */
        public static void main(String[] args){


            System.out.println(sumOdd(1, 100));//→ should return 2500
            System.out.println(sumOdd(-1, 100)); //→  should return -1
            System.out.println( sumOdd(100, 100));//→ should return 0
            System.out.println(sumOdd(13, 13));//→ should return 13 (This set contains one number, 13, and it is odd)
            System.out.println(sumOdd(100, -100));//→ should return -1
            System.out.println(sumOdd(100, 1000)); //→ should return 247500

        }

        public static  boolean isOdd(int number){

            if (number > 0 ){
                if(number%2==0){
                    return true;
                }else {
                    return false;
                }
            } else {
                return false;
            }
        }


        public static int sumOdd(int start , int end){

            int sum = 0;
            if(start > 0 && end > 0 && end >= start){

                for (int i = start; i<=end;i++){

                    if (isOdd(i)!=true){

                        sum+=i;

                    }

                }

                return sum;

            }else {
                return -1;
            }


        }

    }

    public static class Chellenge_14_2_EvennumberChecker {


        private static Scanner scanner = new Scanner(System.in);

        public static void main (String[] args){

            int StartingNumber = scanner.nextInt();
            scanner.nextLine();

            int EndingNumber = scanner.nextInt();
            scanner.nextLine();

            int count = 0;

            int sum = 0;

            while(StartingNumber < EndingNumber){

                StartingNumber++;




                if (!isEvenNumber(StartingNumber)){
                    continue;
                } else {
                    count++;
                    System.out.println("Count " +count);
                    if (count!=5){
                        sum+=StartingNumber;
                    } else {
                        break;
                    }



                }

                System.out.println("sum number is -" +sum);
            }




        }

        public static boolean isEvenNumber(int Number){

            if (Number%2 == 0){
                return true;
            } else {
                return false;
            }

        }
    }
}
