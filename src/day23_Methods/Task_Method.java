package day23_Methods;

public class Task_Method {
    /*
    task:
	1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
     */

    public static void main(String[] args) {

        PrintOddNumber();
        System.out.println();
        PrintEvenNumber();

    }

    public static void PrintOddNumber(){
        for(int i = 1; i <=100; i++){
            if (i %2 == 1){
                System.out.print(i + " ");
            }
        }
    }

    public static void PrintEvenNumber(){
        for(int i = 1; i <=100; i++){
            if (i %2 == 0){
                System.out.print(i + " ") ;
            }
        }
    }
}
