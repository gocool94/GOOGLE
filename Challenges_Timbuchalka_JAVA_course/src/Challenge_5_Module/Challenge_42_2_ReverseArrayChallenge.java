package Challenge_5_Module;

import java.util.Arrays;

public class Challenge_42_2_ReverseArrayChallenge {

    public static void main(String[] args){
        int[] ActualArray;

        reverse(new int[]{1, 2, 3,4,5});

    }

    public static void reverse(int[] array){

        int MaxIndex = array.length-1;
        int halflength = array.length / 2 ;


        System.out.println("IN");
        for (int i = 0; i<halflength;i++){
            System.out.println(i);
            int temp = array[i];
            System.out.println(temp);
            array[i] = array[MaxIndex - i];
            System.out.println("here");
            array[MaxIndex-i] = temp;
        }

        System.out.println(Arrays.toString(array));

    }
}
