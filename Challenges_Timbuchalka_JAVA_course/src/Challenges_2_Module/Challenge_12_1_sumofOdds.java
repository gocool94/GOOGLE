package Challenges_2_Module;

public class Challenge_12_1_sumofOdds {

    public static void main(String[] args){

        int sum = 0;
        int count = 0;

        for (int i = 1;i<1000;i++){


            if (count ==5){
                break;
            }

            else if (i %3 ==0 && i%5 ==0){
                System.out.println(i);
                sum+=i;
                count+=1;
            }


        }

        System.out.println(sum);
        System.out.println(count);
    }
}
