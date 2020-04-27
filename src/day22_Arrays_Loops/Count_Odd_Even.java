package day22_Arrays_Loops;

public class Count_Odd_Even {
    /*
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
     */
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int countOddNumbers = 0;
        int countEvenNumbers = 0;

        for( int each : arr){
//            if (each % 2 == 0){
//                countEvenNumbers++;
//            }else{
//                countOddNumbers++;
//            }

            if (each % 2 == 0){
                countEvenNumbers++;
                continue;
            }
                countOddNumbers++;

        }

        System.out.println("Even numbers: " + countEvenNumbers);
        System.out.println("Odd numbers : " + countOddNumbers);


    }
}
