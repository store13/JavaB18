package day10_Switch_Scanner;

public class localVariables {
    /*
    local variable : variables that are declared within a block
                     cannot be used outside its the block
                     MUST be initialized before we use then
     */

    public static void main(String[] args) {
    // declare variable: DataType variableName;

        int a = 0;

        if (true){
            System.out.println(a);
            int b= 10;
        }

        // System.out.println(b); // local variables can not be used outside its block

        switch (3){
            case 1:
                int c = 100;

            case 2:
                // System.out.println(c); // the local variable c belongs to the case block 1
        }
    //    System.out.println(c);

        if (9 > 10){
            int t = 100;
        }else if (11 > 10){
            int t = 200;
        }else if (12 > 10){
            int t = 300;
        }

        // System.out.println(t);
    }

}
