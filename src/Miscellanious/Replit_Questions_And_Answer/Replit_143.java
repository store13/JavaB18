package Miscellanious.Replit_Questions_And_Answer;

public class Replit_143 {

    public static void main(String[] args) {
        printHollowRect();
    }

    public static void printHollowRect() {
        // write your code here:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//for (int i = 1; i <= 5; i++){
//        for (int j = 1; j <=5; j++){
//        if ( (i == 1 && j == 1 ) || (i == 5 && j == 5) || (i == j)){
//        System.out.print("*");
//        }else{
//        System.out.print(" ");
//        }
//
//        }
//        System.out.println();
