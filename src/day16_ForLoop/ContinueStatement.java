package day16_ForLoop;

public class ContinueStatement {
    /*
    Continue
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){ // i: 1,2, 3, 4 ,5

            if (i == 3){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i <=20; i++){ // it should be start from 1 !!?? I guess
            if (i % 2 == 1){  // ( i % 2 != 0) , skips all the odd number
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
