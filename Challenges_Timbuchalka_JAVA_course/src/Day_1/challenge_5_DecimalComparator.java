package Day_1;

public class challenge_5_DecimalComparator {

    public static void main(String[] args){

        areEqualByThreeDecimalPlaces(3.176,3.175);
    /*
    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
     */

    }



        public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
             one =  (int)(one * 1000);
             two = (int)(two * 1000);


            System.out.println(one);
            System.out.println(two);

            if(one == two){
                System.out.println(true);
                return true;
            }
            else

                System.out.println(false);
            return false;
        }
    }
