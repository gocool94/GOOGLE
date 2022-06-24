package Challenges_1_Module;

import java.util.Scanner;

public class Chellenge_14_2_EvennumberChecker {


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
