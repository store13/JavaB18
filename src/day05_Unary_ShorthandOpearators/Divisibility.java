package day05_Unary_ShorthandOpearators;

public class Divisibility {
    /*
    2. Divisibility, write a program that can check if a number is evenly diviisble by 2, 3, 5
    Ex ;
    number = 65 ==> int

    divisibleBy2 ==> true/false
    divisibleBy3 ==> true/false
    divisibleBy5 ==> true/false

    output:
    65 is divisible by 2: false
    65 is divisible by 3: true
    65 is divisible by 5: true
     */

    public static void main(String[] args) {

        int number = 65;

        boolean divisibleBy2 = number %2 ==0;

        boolean divisibleBy3 = number %3 == 0;

        boolean divisibleBy5 = number %5 == 0;

        String result1 = number + "is divisible by 2:" + divisibleBy2;  // concatenation
        String result2 = number + "is divisible by 3:" + divisibleBy3;
        String result3 = number + "is divisible by 5:" + divisibleBy5;

        /*
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        */
        //System.out.println(result1 +"\n" + result2 + "\n" + result3);
                // concatenation ==> returns String

        String finalResult =result1 +"\n" + result2 + "\n" + result3;
        System.out.println(finalResult);




    }
}
