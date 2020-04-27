package day16_ForLoop;

public class BreakStatement {
    /*
    break statement :
        used for exciting switch statement loops as well.
        whenever we need to forcefully stop the iteration of the loop,
        we can use break statement

     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5;i++) { // i: 1,2,3,4,5

            System.out.println("Hello World");  // 3 times print

            if (i == 3){
                break;      // forcefully stop the loop
            }
            // System.out.println("Hello World"); // 2 times print
            //break;  // forcefully stop the loop

        }

        for (char i = 'a'; i <= 'z'; i++){

            if (i =='e'){
                break;
            }

            System.out.println(i);

        }



    }
}
