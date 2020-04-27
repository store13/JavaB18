package Miscellanious;

import java.util.Scanner;

public class QuestionsFromStudents {

    public static void main(String[] args) {
//        Scanner n=new Scanner(System.in);
//        String a=n.nextLine();
//        String b=n.next();
//        if(a==b){ // we should use EQUAL Method ...
//            System.out.println("equal");
//        }else{
//            System.out.println("not");
//        }
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //WRITE YOUR CODE HERE
//        int w = word.length();
//        String result = ""+word.charAt(w-1)+word.charAt(w-2)+word.charAt(w-3)+word.charAt(w-4)+word.charAt(w-5);
//        if(w==5){
//            System.out.println(result);
//        }else if(w < 5){
//            System.out.println("Too short!");
//        }else{
//            System.out.println("Too long!");
//        }
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    // 154
    public static void isPalindrome(int num){

        String number=""+num;
        String reversed="";
        for(int i= number.length()-1; i>=0; i--){
            reversed+=""+number.charAt(i);
        }
        if(reversed.equals(number)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}



