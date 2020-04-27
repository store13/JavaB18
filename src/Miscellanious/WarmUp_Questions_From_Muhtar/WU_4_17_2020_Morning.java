package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_4_17_2020_Morning {
    /*
    1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrome("level")  ==> true
				palindrome("Cybertek") ==> false
     */
    public static void main(String[] args) {

        Max(12,33);
        Calculation(12567, 434, '%');

    }

    public static void Max(int num1, int num2){
        if (num1 > num2){
            System.out.println("Max: " + num1);
        }else{
            System.out.println("Max: " + num2);
        }
    }

    public static void Calculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Operator");
                //break;
        }

    }

    public static void PalindromeOrNot(String str){

    }
}
